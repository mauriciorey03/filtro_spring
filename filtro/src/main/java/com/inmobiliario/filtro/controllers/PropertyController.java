package com.inmobiliario.filtro.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.dao.DataAccessException;
import org.springframework.data.mapping.model.Property;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.inmobiliario.filtro.config.PropertyDTOConverter;
import com.inmobiliario.filtro.dto.PropertyDTO;
import com.inmobiliario.filtro.repository.entity.PropertyEntity;
import com.inmobiliario.filtro.services.PropertyService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/cities/")
public class PropertyController {

    private PropertyService propertyService;

    private PropertyDTOConverter propertyDTOConverter;

    @GetMapping
    public ResponseEntity<List<PropertyDTO>> getAllCities() {
        List<Property> cities = propertyService.findAll();
        List<PropertyDTO> propertyDTOs = cities.stream()
                .map(propertyDTOConverter::convertPropertyDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(propertyDTOs);
    }

    @GetMapping("/{propertyId}")
    public ResponseEntity<PropertyDTO> getProperty(@PathVariable Long propertyId) {
        Property property = propertyService.findById(propertyId);
        PropertyDTO propertyDTO = propertyDTOConverter.convertPropertyDTO(property);
        return ResponseEntity.ok(propertyDTO);
    }

    @PostMapping
    public ResponseEntity<PropertyDTO> createProperty(@RequestBody PropertyDTO propertyDTO) {
        Property property = propertyDTOConverter.convertPropertyEntity(propertyDTO);
        Property savedProperty = propertyService.save(property);
        PropertyDTO savedPropertyDTO = propertyDTOConverter.convertPropertyDTO(savedProperty);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPropertyDTO);
    }

    @PutMapping("/{propertyId}")
    public ResponseEntity<PropertyDTO> updateProperty(@PathVariable Long propertyId, @RequestBody PropertyDTO propertyDTO) {
        Property property = propertyDTOConverter.convertPropertyEntity(propertyDTO);
        Property updatedProperty = propertyService.update(propertyId, property);
        PropertyDTO updatedPropertyDTO = propertyDTOConverter.convertPropertyDTO(updatedProperty);
        return ResponseEntity.ok(updatedPropertyDTO);
    }

    @DeleteMapping("/{propertyId}")
    public ResponseEntity<?> deleteProperty(@PathVariable Long propertyId) {
        propertyService.delete(propertyId);
        return ResponseEntity.noContent().build();
    }
}