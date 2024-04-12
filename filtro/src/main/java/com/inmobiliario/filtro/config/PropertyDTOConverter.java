package com.inmobiliario.filtro.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.inmobiliario.filtro.dto.PropertyDTO;
import com.inmobiliario.filtro.repository.entity.PropertyEntity;


@Component
public class PropertyDTOConverter {
    
    private ModelMapper dbm;


    public PropertyDTOConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        this.dbm = modelMapper;

    }


    public PropertyDTO convertPropertyDTO(PropertyEntity property){

        PropertyDTO propertyDTO = dbm.map( property, PropertyDTO.class);
        if(property.getId() != null){
            propertyDTO.setAddress(property.getAddress());
            propertyDTO.setId(property.getId());
        }
        return propertyDTO;
    }
    public PropertyEntity convertCampusEntity(PropertyDTO propertyDTO){
        return dbm.map(propertyDTO, PropertyEntity.class);   
    }
}