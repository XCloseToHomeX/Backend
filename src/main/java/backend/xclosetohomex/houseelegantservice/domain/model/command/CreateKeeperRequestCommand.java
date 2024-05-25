package backend.xclosetohomex.houseelegantservice.domain.model.command;

public record CreateKeeperRequestCommand(String name, String message, String photoUrl, Float rating) {
}