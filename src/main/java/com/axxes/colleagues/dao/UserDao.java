package com.axxes.colleagues.dao;

import com.axxes.colleagues.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {


}
