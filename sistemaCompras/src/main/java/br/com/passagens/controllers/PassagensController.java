package br.com.passagens.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.passagens.models.PassagensModel;
import br.com.passagens.services.PassagensService;

@Controller
public class PassagensController {

	@Autowired
	PassagensService passagensService;

	@GetMapping("/")
	public ModelAndView mostarEmpresas() {
		ModelAndView modelAndView = new ModelAndView("Onibus.html");
		modelAndView.addObject("onibus", passagensService.mostrarEmpresas());
		return modelAndView;
	}

	@PostMapping("/compra")
	public String SalvarCadastro(PassagensModel passagensModel) {
		return passagensService.salvarCompra(passagensModel);
	}

	@GetMapping("/compra")
	public ModelAndView mostrarCadastro(PassagensModel passagensModel) {
		ModelAndView modelAndView = new ModelAndView("cadastro.html");
		return modelAndView;

	}

	@GetMapping("/erro")
	public ModelAndView mostrarErro() {
		ModelAndView modelAndView = new ModelAndView("erro.html");
		return modelAndView;
	}
	
	@GetMapping("/sucesso")
	public ModelAndView mostrarSucesso() {
		ModelAndView modelAndView = new ModelAndView("sucesso.html");
		return modelAndView;
	}
	
}
