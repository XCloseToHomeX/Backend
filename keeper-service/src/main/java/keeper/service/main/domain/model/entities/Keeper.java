package keeper.service.main.domain.model.entities;

import jakarta.persistence.*;
import keeper.service.shared.domain.model.entities.AuditableModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Keeper extends AuditableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Keeper(String name, String country, String city, String streetAddress, String description, String photoUrl, String rating) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.streetAddress = streetAddress;
        this.description = description;
        this.photoUrl = photoUrl;
        this.rating = rating;
    }

    private String name;
    private String country;
    private String city;
    private String streetAddress;
    private String description;
    private String photoUrl;
    private String rating;

    public Keeper() {

    }
}