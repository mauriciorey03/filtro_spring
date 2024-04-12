package com.inmobiliario.filtro.dto;

import com.inmobiliario.filtro.repository.entity.ZoneType;

import lombok.Data;

@Data
public class PropertyDTO {
    private Long id;

    private float size;

    private String address;

    private float price;
    
    private boolean availability;

    private boolean keysState;

    private boolean used;

    private ZoneType zoneType;
}
