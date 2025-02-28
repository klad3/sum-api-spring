package me.klad3.sumapispring.repository;

import me.klad3.sumapispring.model.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {
    Optional<User> findByApiKey(String apiKey);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByInstitutionId(String institutionId);
}
