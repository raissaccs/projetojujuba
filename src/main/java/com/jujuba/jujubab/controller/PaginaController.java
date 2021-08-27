package com.jujuba.jujubab.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jujuba.jujubab.model.Lucro;
import com.jujuba.jujubab.model.MaodeObra;
import com.jujuba.jujubab.model.MateriaPrima;
import com.jujuba.jujubab.service.MaodeobraService;

@Controller
public class PaginaController {

	@Autowired
	MaodeobraService maodeobraService;

	@GetMapping("/materiaprima")
	public String abrirPagina() {
		return "materiaprima";
	}
	
	@RequestMapping(value = "/materiaprima", method = RequestMethod.POST)
	public String saveFormulario(@Valid Lucro lucro, MaodeObra horas, MaodeObra valorMO, MateriaPrima nome ,MateriaPrima valorMP, MateriaPrima quantidade, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return "redirect:/materiaprima";
		}
		return "/";
	}
	}
