
package com.inmobiliario.filtro.services;

import java.util.List;
import com.inmobiliario.filtro.repository.entity.VisitedStatexClientEntity;

public interface VisitedStatexClientService {
    List<VisitedStatexClientEntity> findAll();

    VisitedStatexClientEntity save(VisitedStatexClientEntity visitedstatexclient);

    VisitedStatexClientEntity update(Long id, VisitedStatexClientEntity visitedstatexclient);

    void delete(Long id);

    VisitedStatexClientEntity findById(Long id);

}
