package com.system_manager.my_manager.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sucursales")
public class Sucursal {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
}
