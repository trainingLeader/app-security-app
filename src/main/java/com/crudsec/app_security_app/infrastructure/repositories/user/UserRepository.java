package com.crudsec.app_security_app.infrastructure.repositories.user;

import org.springframework.data.repository.CrudRepository;

import com.crudsec.app_security_app.domain.entity.User;

public interface UserRepository extends CrudRepository<User,Long> {

}
