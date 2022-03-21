package com.evans.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evans.models.Vacante;

public interface VacantesRepository extends JpaRepository<Vacante, Integer>{

}
