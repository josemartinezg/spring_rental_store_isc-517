package com.pucmm.spring_rental_store.repositories;

import com.pucmm.spring_rental_store.models.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    Equipo findEquipoById(long id);
}
