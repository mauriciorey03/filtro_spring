
package com.inmobiliario.filtro.services;

import java.util.List;

import com.inmobiliario.filtro.repository.entity.ZoneEntity;

public interface ZoneService {
    List<ZoneEntity> findAll();

    ZoneEntity save(ZoneEntity zone);

    ZoneEntity update(Long id, ZoneEntity zone);

    void delete(Long id);

    ZoneEntity findById(Long id);

}
