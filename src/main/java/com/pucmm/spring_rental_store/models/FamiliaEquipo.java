<<<<<<< HEAD:src/main/java/com/pucmm/spring_rental_store/models/FamiliaEquipo.java
package com.pucmm.spring_rental_store.models;
=======
package com.pucmm.spring_rental_store.entities;
>>>>>>> f0515efec41aaad2afeec70d32a2c5775e9bc668:src/main/java/com/pucmm/spring_rental_store/entities/FamiliaEquipo.java

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
@Table(name = "familia_equipo")
public class FamiliaEquipo implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private String descripcion;
    @OneToMany(mappedBy = "familia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<SubFamiliaEquipos> listaSubFamilias;

}
