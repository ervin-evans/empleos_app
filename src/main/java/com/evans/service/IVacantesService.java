package com.evans.service;

import java.util.List;

import com.evans.models.Vacante;

public interface IVacantesService {
	public List<Vacante> findAll();
	public Vacante findById(Integer id);
}
