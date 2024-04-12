
package com.inmobiliario.filtro.services;

import java.util.List;
import com.inmobiliario.filtro.repository.entity.CityEntity;

public interface CityService {
    List<CityEntity> findAll();

    CityEntity save(CityEntity city);

    CityEntity update(Long id, CityEntity city);

    void delete(Long id);

    CityEntity findById(Long id);

}
