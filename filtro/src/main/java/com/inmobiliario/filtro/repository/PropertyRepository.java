
package com.inmobiliario.filtro.repository;
import org.springframework.data.repository.CrudRepository;
import com.inmobiliario.filtro.repository.entity.PropertyEntity;

public interface PropertyRepository extends CrudRepository<PropertyEntity,Long>{
    
}

