
package com.inmobiliario.filtro.repository;
import org.springframework.data.repository.CrudRepository;
import com.inmobiliario.filtro.repository.entity.ClientEntity;

public interface ClientRepository extends CrudRepository<ClientEntity,Long>{
    
}

