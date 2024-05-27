package traveller.service.main.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "House")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String city;
    private String streetAddress;
    private String price;
    private String capacity;
    private String rating;
    private String photoUrl;

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", price='" + price + '\'' +
                ", capacity='" + capacity + '\'' +
                ", rating='" + rating + '\'' +
                "}";
    }
}
