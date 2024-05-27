package keeper.service.main.interfaces.rest.resource;

public record KeeperResource(Long id, String name, String country, String city, String streetAddress,
                             String description, String photoUrl, String rating) {
}
