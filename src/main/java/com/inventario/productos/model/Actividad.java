/*
 * 
 */
package com.inventario.productos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * Actividad de clase
 * 

 */
@Entity 
@Data

public class Actividad {

 @Id 
@Column
       private Long id;
@Column
       private String nombre;
@Column
       private String descripcion;
@Column
       private int creditos;
@Column
       private String profesor;
     
}
