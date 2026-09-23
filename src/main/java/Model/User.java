package Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @JsonIgnore
    @Column(nullable = false)
    private String passwordHash;
    @Column(nullable = false,unique = true)
    private String username;
        @Column(nullable = false,unique = true)
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
