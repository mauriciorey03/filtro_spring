
package com.inmobiliario.filtro.repository;
import org.springframework.data.repository.CrudRepository;
import com.inmobiliario.filtro.repository.entity.UsersEntity;

public interface UsersRepository extends CrudRepository<UsersEntity,Long>{
    
}

