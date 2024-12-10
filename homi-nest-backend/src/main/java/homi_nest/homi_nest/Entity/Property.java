package homi_nest.homi_nest.Entity;

// Importing required annotations from Jakarta Persistence and Lombok
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Marks this class as a JPA entity mapped to a database table
@Entity
@Data   // Generates boilerplate code like getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // Generates a constructor with all fields as parameters
@NoArgsConstructor  // Generates a no-arguments constructor

public class Property {

    @Id // Marks this field as the primary key for the entity
    // Specifies that the primary key is automatically generated using a database-specific identity column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String city;

    private Double price;

    //multiple Property instances can be associated with a single User entity
    @ManyToOne

    // @JoinColumn(name = "owner_id") foreign key column in the Property table that will be used to reference the User table.
    // In this case, the column is named owner_id
    @JoinColumn(name = "owner_id")
    private User owner;
}
