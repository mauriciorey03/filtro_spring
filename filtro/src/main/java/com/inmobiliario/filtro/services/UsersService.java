
package com.inmobiliario.filtro.services;

import java.util.List;

import com.inmobiliario.filtro.repository.entity.UsersEntity;

public interface UsersService {
    List<UsersEntity> findAll();

    UsersEntity save(UsersEntity users);

    UsersEntity update(Long id, UsersEntity users);

    void delete(Long id);

    UsersEntity findById(Long id);

}
