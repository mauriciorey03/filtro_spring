package com.inmobiliario.filtro.repository;
import org.springframework.data.repository.CrudRepository;
import com.inmobiliario.filtro.repository.entity.CharacteristicsEntity;

public interface CharacteristicsRepository extends CrudRepository<CharacteristicsEntity,Long>{
    
}