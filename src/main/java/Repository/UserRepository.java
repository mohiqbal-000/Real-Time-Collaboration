package Repository;

import Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository <User, UUID> {


    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);

   boolean exitsByUsername(String username);
   boolean exitsByEmail(String email);
}
