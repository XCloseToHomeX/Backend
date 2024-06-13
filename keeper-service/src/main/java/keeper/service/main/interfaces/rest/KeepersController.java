package keeper.service.main.interfaces.rest;


import io.swagger.v3.oas.annotations.tags.Tag;
import keeper.service.main.domain.model.command.CreateKeeperCommand;
import keeper.service.main.domain.model.command.UpdateKeeperCommand;
import keeper.service.main.domain.model.entities.Keeper;
import keeper.service.main.domain.model.query.GetAllKeepersQuery;
import keeper.service.main.domain.model.query.GetKeeperByIdQuery;
import keeper.service.main.domain.service.KeeperCommandService;
import keeper.service.main.domain.service.KeeperQueryService;
import keeper.service.main.interfaces.rest.resource.CreateKeeperResource;
import keeper.service.main.interfaces.rest.resource.KeeperResource;
import keeper.service.main.interfaces.rest.resource.UpdateKeeperResource;
import keeper.service.main.interfaces.rest.transform.CreateKeeperCommandFromResourceAssembler;
import keeper.service.main.interfaces.rest.transform.KeeperResourceFromEntityAssembler;
import keeper.service.main.interfaces.rest.transform.UpdateKeeperCommandFromResourceAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/keepers", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Keepers", description = "Keepers Management Endpoints")
public class KeepersController {

    @Autowired
    KeeperCommandService keeperCommandService;

    @Autowired
    KeeperQueryService keeperQueryService;

    @PostMapping
    public ResponseEntity<KeeperResource> createKeeperResource(@RequestBody CreateKeeperResource resource){
        CreateKeeperCommand createKeeperCommand = CreateKeeperCommandFromResourceAssembler.toCommandFromResource(resource);
        Long keeperId = keeperCommandService.handle(createKeeperCommand);
        if(keeperId == 0L){
            return ResponseEntity.badRequest().build();
        }
        GetKeeperByIdQuery getKeeperByIdQuery = new GetKeeperByIdQuery(keeperId);
        Optional<Keeper> keeper = keeperQueryService.handle(getKeeperByIdQuery);
        if(keeper.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        KeeperResource keeperResource = KeeperResourceFromEntityAssembler.toResourceFromEntity(keeper.get());
        return new ResponseEntity<>(keeperResource, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<KeeperResource>> getAllKeepers(){
        GetAllKeepersQuery getAllKeepersQuery = new GetAllKeepersQuery();
        List<Keeper> keepers = keeperQueryService.handle(getAllKeepersQuery);
        List<KeeperResource> keeperResources = keepers.stream().map(KeeperResourceFromEntityAssembler::toResourceFromEntity).toList();
        return ResponseEntity.ok(keeperResources);
    }

    @GetMapping("/{keeperId}")
    public ResponseEntity<KeeperResource> getKeeperById(@PathVariable Long keeperId){
        GetKeeperByIdQuery getKeeperByIdQuery = new GetKeeperByIdQuery(keeperId);
        Optional<Keeper> keeper = keeperQueryService.handle(getKeeperByIdQuery);
        if(keeper.isEmpty()) return ResponseEntity.badRequest().build();
        KeeperResource keeperResource = KeeperResourceFromEntityAssembler.toResourceFromEntity(keeper.get());
        return ResponseEntity.ok(keeperResource);
    }

    @PutMapping("/{keeperId}")
    public ResponseEntity<KeeperResource> updateKeeper(@PathVariable Long keeperId, @RequestBody UpdateKeeperResource resource){
        UpdateKeeperCommand updateKeeperCommand = UpdateKeeperCommandFromResourceAssembler
                .toCommandFromResource(keeperId, resource);
        Optional<Keeper> updatedKeeper = keeperCommandService.handle(updateKeeperCommand);
        if(updatedKeeper.isEmpty()) return ResponseEntity.badRequest().build();
        KeeperResource keeperResource = KeeperResourceFromEntityAssembler.toResourceFromEntity(updatedKeeper.get());
        return ResponseEntity.ok(keeperResource);
    }
}