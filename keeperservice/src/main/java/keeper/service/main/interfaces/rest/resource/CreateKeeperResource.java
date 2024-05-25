package keeper.service.main.interfaces.rest.resource;

public record CreateKeeperResource(String name, String country, String city, String streetAddress,
                                   String description, String photoUrl, String rating) {
}
