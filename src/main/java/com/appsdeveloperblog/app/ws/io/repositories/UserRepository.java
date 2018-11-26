package com.appsdeveloperblog.app.ws.io.repositories;

import com.appsdeveloperblog.app.ws.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <UserEntity,Long> {
    // DON'T need to implements create, read, update and delete
    // they are there by default
    // Only need to implement if we require findUserByEmail, findUserByFirstName ...
    //
    //UserEntity findUserByEmail(String email);
    UserEntity findByEmail(String email);
}
