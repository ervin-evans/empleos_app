package com.evans.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evans.models.Vacante;
import com.evans.repositories.VacantesRepository;
import com.evans.service.IVacantesService;

@Service
public class VacantesServiceImpl implements IVacantesService {

	@Autowired
	private VacantesRepository vacantesRepo;

	@Override
	public List<Vacante> findAll() {
		List<Vacante> vacantes = vacantesRepo.findAll();
		return vacantes;
	}

}
