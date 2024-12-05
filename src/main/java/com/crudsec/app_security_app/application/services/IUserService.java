package com.crudsec.app_security_app.application.services;

import java.util.List;

import com.crudsec.app_security_app.domain.entity.User;

public interface IUserService {
    List<User> findAll();
    User save(User user);
}
