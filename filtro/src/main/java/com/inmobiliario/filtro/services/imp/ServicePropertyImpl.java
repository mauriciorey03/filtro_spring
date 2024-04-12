package com.inmobiliario.filtro.services.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.inmobiliario.filtro.config.PropertyDTOConverter;
import com.inmobiliario.filtro.dto.PropertyDTO;
import com.inmobiliario.filtro.repository.PropertyRepository;
import com.inmobiliario.filtro.services.PropertyService;
import com.inmobiliario.filtro.repository.entity.PropertyEntity;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServicePropertyImpl implements PropertyService {
    
    public PropertyRepository propertyRepository;

    private PropertyDTOConverter convert;

    @Override
    @Transactional
    public List<PropertyDTO> findAll() {
        List<PropertyEntity> propertyEntity= (List<PropertyEntity>) propertyRepository.findAll();
        List<PropertyDTO> propertyDTO=new ArrayList<>();       

           for(PropertyEntity  estudiante  :propertyEntity){
                propertyDTO.add(convert.convertPropertyDTO(estudiante));
          }
          return propertyDTO;
    }

    @Override
    public PropertyEntity save(PropertyEntity property) {
        return property.save(this);
    }

    @Override
    public PropertyEntity update(Long id, PropertyEntity property) {
        Optional<PropertyEntity> propertyCurrentOptional = propertyRepository.findById(id);

        if(propertyCurrentOptional.isPresent()) {
            PropertyEntity propertyCurrent = propertyCurrentOptional.get();
            propertyCurrent.setAddress(property.getAddress());
            propertyCurrent.setAvailability(property.isAvailability());
            propertyRepository.save(propertyCurrent);
            return propertyCurrent;
        }

        return null;
    }

    @Override
    public void delete(Long id) {
        Optional<PropertyEntity> propertyOptional=propertyRepository.findById(id);
        if(propertyOptional.isPresent()) {
            propertyRepository.delete(propertyOptional.get());
        }   
    }

    @Override
    public PropertyDTO findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

 

}
