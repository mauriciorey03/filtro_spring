package com.inmobiliario.filtro.dto;

import java.util.Date;
import lombok.Data;

@Data
public class VisitsDTO {
    private Long id;

    private int idClient;

    private int idState;

    private Date dateVisted;

    private String comment;

    private boolean interested;
}
