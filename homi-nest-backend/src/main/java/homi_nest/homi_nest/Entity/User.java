package homi_nest.homi_nest.Entity;

// Importing required annotations from Jakarta Persistence and Lombok
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// Marks this class as a JPA entity mapped to a database table
@Entity
@Data   // Generates boilerplate code like getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // Generates a constructor with all fields as parameters
@NoArgsConstructor  // Generates a no-arguments constructor
public class User {

        @Id // Marks this field as the primary key for the entity
        // Specifies that the primary key is automatically generated using a database-specific identity column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String firstName;

        private String lastName;

        private String email;

        private String password;
}
