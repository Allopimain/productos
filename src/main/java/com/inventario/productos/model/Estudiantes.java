package com.inventario.productos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
    private Long id;
@Column
    private String nombre;
@Column
    private String apellido;
@Column
    private String correo;
@Column
    private String telefono;

}

