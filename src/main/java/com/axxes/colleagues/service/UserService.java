package com.axxes.colleagues.service;

import com.axxes.colleagues.domain.User;

import java.util.Optional;

public interface UserService {
    Iterable<User> findAll();

    Optional<User> findById(long id);

    User save(User user);

    void deleteById(Long aLong);

    void delete(User user);

}
