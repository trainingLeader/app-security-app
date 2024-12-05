package com.crudsec.app_security_app.infrastructure.repositories;

import java.util.*;
import org.springframework.data.repository.CrudRepository;

import com.crudsec.app_security_app.domain.entity.Role;

public interface RoleRepository extends CrudRepository<Role,Long>{
        Optional<Role> findByName(String name);
}
