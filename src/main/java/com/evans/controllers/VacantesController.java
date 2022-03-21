package com.evans.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.evans.models.Vacante;
import com.evans.service.IVacantesService;

@Controller
@RequestMapping(method = RequestMethod.GET, value = { "/vacantes" })
public class VacantesController {

	@Autowired
	private IVacantesService iVacantesService;

	@GetMapping("/search/results")
	public String showSearchReults(Model model) {
		List<Vacante> vacantes = iVacantesService.findAll();
		model.addAttribute("vacantes", vacantes);

		return "results";
	}

}
