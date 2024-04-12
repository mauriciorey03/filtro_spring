
package com.inmobiliario.filtro.services;

import java.util.List;



import com.inmobiliario.filtro.repository.entity.OfficeEntity;

public interface OfficeService {
    List<OfficeEntity> findAll();

    OfficeEntity save(OfficeEntity office);

    OfficeEntity update(Long id, OfficeEntity office);

    void delete(Long id);

    OfficeEntity findById(Long id);

}
