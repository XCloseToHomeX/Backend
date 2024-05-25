package backend.xclosetohomex.houseelegantservice.interfaces.rest.resources;

public record CreateHouseResource (String country, String city, String streetAddress,
                                   String price, String capacity, String rating, String photoUrl){
}
