
package com.inmobiliario.filtro.repository.entity;

import java.io.Serializable;

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
@Table(name="characteristics")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacteristicsEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int rooms;

    private int bathrooms;

    private int totalEntrys;

    private float size;

    @Column(nullable = false)
    private boolean kitchen;

    @Column(nullable = false)
    private boolean cleaningRoom;

    @Column(nullable = true)
    private boolean used;

    private String other;

}
