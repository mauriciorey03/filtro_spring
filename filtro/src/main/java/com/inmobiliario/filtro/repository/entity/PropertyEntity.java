
package com.inmobiliario.filtro.repository.entity;

import java.io.Serializable;

import com.inmobiliario.filtro.services.imp.ServicePropertyImpl;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="property")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyEntity implements Serializable {
    public PropertyEntity save(ServicePropertyImpl servicePropertyImpl) {
        return servicePropertyImpl.propertyRepository.save(this);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float size;

    private String address;

    private float price;
    
    @Column(nullable = true)
    private boolean availability;

    @Column(nullable = true)
    private boolean keysState;

    @Column(nullable = true)
    private boolean used;

    private ZoneType zoneType;
    //@JsonIgnore
    // @OneToMany(mappedBy = "type", cascade = CascadeType.ALL, orphanRemoval = true)
}