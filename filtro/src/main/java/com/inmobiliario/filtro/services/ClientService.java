
package com.inmobiliario.filtro.services;

import java.util.List;

import com.inmobiliario.filtro.repository.entity.ClientEntity;

public interface ClientService {
    List<ClientEntity> findAll();

    ClientEntity save(ClientEntity client);

    ClientEntity update(Long id, ClientEntity client);

    void delete(Long id);

    ClientEntity findById(Long id);

}
