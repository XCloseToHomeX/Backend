package keeper.service.main.domain.model.command;

public record UpdateKeeperCommand(Long id, String name, String country, String city, String streetAddress, String description, String photoUrl, String rating) {
}
