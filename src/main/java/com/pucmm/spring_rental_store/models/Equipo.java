<<<<<<< HEAD:src/main/java/com/pucmm/spring_rental_store/models/Equipo.java
package com.pucmm.spring_rental_store.models;
=======
package com.pucmm.spring_rental_store.entities;
>>>>>>> f0515efec41aaad2afeec70d32a2c5775e9bc668:src/main/java/com/pucmm/spring_rental_store/entities/Equipo.java

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Equipo implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String marca;
    private String modelo;
    private String descripcion;
    @Column(name="costo_alquiler_diario")
    private float costoAlquilerDiario;
    @Column(name="imagen_equipo")
    private String imagenEquipo;
    @Column(name="cantidad_existencia")
    private int cantidadEnExistencia;
    @ManyToMany(mappedBy = "equipos")
    private Set<Alquiler> listaDeAlquileres;
    @Column(name="sub_familia")
    @ManyToOne
    private SubFamiliaEquipos subFamiliaDeEquipos;

    public int aumentarExistencia(){
        return 0;
    }

    public int disminuirExistencia(){
        return 0;
    }

    public int verificarCantidadExistencia(){
        return 0;
    }
}



