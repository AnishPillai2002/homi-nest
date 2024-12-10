package homi_nest.homi_nest.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// Marks this class as a JPA entity mapped to a database table
@Entity
@Data   // Generates boilerplate code like getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // Generates a constructor with all fields as parameters
@NoArgsConstructor  // Generates a no-arguments constructor

public class Booking {

    @Id // Marks this field as the primary key for the entity
    // Specifies that the primary key is automatically generated using a database-specific identity column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;

    private LocalDate endDate;

    //multiple Booking instances can be associated with a single Property entity
    @ManyToOne
    @JoinColumn(name = "property_id") // Foreign key column name = property_id
    private Property property;


}
