package peaksoft.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * name : kutman
 **/
@Entity
@Table(name = "companies")
@Getter
@Setter
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private String image;

    public Company(String name, String country, String image) {
        this.name = name;
        this.country = country;
        this.image = image;
    }
}
