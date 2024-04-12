
package com.inmobiliario.filtro.repository.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="visitedstatexclient")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitedStatexClientEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int idClient;

    private int idState;

    private Date dateVisted;

    private String comment;

    @Column(nullable = true)
    private boolean interested;

}
