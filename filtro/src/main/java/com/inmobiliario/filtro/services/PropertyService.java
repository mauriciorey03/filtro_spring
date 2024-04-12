package com.inmobiliario.filtro.services;

import java.util.List;

import org.springframework.data.mapping.model.Property;

import com.inmobiliario.filtro.dto.PropertyDTO;
import com.inmobiliario.filtro.repository.entity.PropertyEntity;

public interface PropertyService {
    List<PropertyDTO> findAll();

    PropertyDTO save(PropertyDTO property);

    PropertyEntity update(Long id, Property property);

    void delete(Long id);

    PropertyDTO findById(Long id);

}
