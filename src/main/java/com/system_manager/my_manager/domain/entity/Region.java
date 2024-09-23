package com.system_manager.my_manager.domain.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "regiones")
public class Region {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length=20,nullable=true)
    private String name;
    
    @ManyToOne
    private Pais paises;

    @OneToMany(mappedBy="regiones")
    private List<Ciudad> ciudades;

    
}
