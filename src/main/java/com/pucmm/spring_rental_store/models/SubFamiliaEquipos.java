<<<<<<< HEAD:src/main/java/com/pucmm/spring_rental_store/models/SubFamiliaEquipos.java
package com.pucmm.spring_rental_store.models;
=======
package com.pucmm.spring_rental_store.entities;
>>>>>>> f0515efec41aaad2afeec70d32a2c5775e9bc668:src/main/java/com/pucmm/spring_rental_store/entities/SubFamiliaEquipos.java

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
@Table(name = "sub_familia_equipo")
public class SubFamiliaEquipos implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private String descripcion;
    @Column(name = "familia_equipo")
    @ManyToOne
    private FamiliaEquipo familiaEquipo;
    @OneToMany(mappedBy = "sub_familia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Equipo> listaEquipos;
}
