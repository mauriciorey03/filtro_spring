
package com.inmobiliario.filtro.services;

import java.util.List;

import com.inmobiliario.filtro.repository.entity.OfficeEntity;
import com.inmobiliario.filtro.repository.entity.OwnerEntity;

public interface OwnerService {
    List<OfficeEntity> findAll();

    OwnerEntity save(OwnerEntity owner);

    OwnerEntity update(Long id, OwnerEntity owner);

    void delete(Long id);

    OwnerEntity findById(Long id);

}
