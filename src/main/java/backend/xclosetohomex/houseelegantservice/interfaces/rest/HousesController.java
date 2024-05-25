package backend.xclosetohomex.houseelegantservice.interfaces.rest;

import backend.xclosetohomex.houseelegantservice.domain.model.query.GetAllHousesQuery;
import backend.xclosetohomex.houseelegantservice.domain.model.query.GetHouseByIdQuery;
import backend.xclosetohomex.houseelegantservice.domain.service.HouseCommandService;
import backend.xclosetohomex.houseelegantservice.domain.service.HouseQueryService;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.CreateHouseResource;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.resources.HouseResource;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.transform.CreateHouseCommandFromResourceAssembler;
import backend.xclosetohomex.houseelegantservice.interfaces.rest.transform.HouseResourceFromEntityAssembler;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/houses", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Houses", description = "Houses Management Endpoints")
public class HousesController {
    private final HouseQueryService houseQueryService;
    private final HouseCommandService houseCommandService;

    public HousesController(HouseQueryService houseQueryService, HouseCommandService houseCommandService) {
        this.houseQueryService = houseQueryService;
        this.houseCommandService = houseCommandService;
    }

    @PostMapping
    public ResponseEntity<HouseResource> createHouseResource(CreateHouseResource resource){
        var createHouseCommand = CreateHouseCommandFromResourceAssembler.toCommandFromResource(resource);
        var houseId = houseCommandService.handle(createHouseCommand);
        if(houseId == 0L){
            return ResponseEntity.badRequest().build();
        }
        var getHouseByIdQuery = new GetHouseByIdQuery(houseId);
        var house = houseQueryService.handle(getHouseByIdQuery);
        if(house.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        var houseResource = HouseResourceFromEntityAssembler.toResourceFromEntity(house.get());
        return new ResponseEntity<>(houseResource, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<HouseResource>> getAllHouses(){
        var getAllHousesQuery = new GetAllHousesQuery();
        var houses = houseQueryService.handle(getAllHousesQuery);
        var houseResources = houses.stream().map(HouseResourceFromEntityAssembler::toResourceFromEntity).toList();
        return ResponseEntity.ok(houseResources);
    }
}
