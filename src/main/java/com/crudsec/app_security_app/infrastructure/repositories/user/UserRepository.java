package com.crudsec.app_security_app.infrastructure.repositories.user;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.crudsec.app_security_app.domain.entity.User;

public interface UserRepository extends CrudRepository<User,Long> {
    boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);
}
