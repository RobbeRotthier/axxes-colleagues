package com.axxes.colleagues.service;

import com.axxes.colleagues.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserService extends CrudRepository<User, Long> {
}
