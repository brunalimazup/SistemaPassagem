package br.com.passagens.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.passagens.models.OnibusModel;
import br.com.passagens.models.PassagensModel;
import br.com.passagens.services.PassagensService;

@Controller
public class PassagensController {

	@Autowired
	PassagensService passagensService;

	@GetMapping ("/")
	public ModelAndView mostarEmpresas() {
		ModelAndView modelAndView = new ModelAndView("Onibus.html");
		modelAndView.addObject("onibus", passagensService.mostrarEmpresas());
		return modelAndView;
	}

	@PostMapping("/compra")
	public String SalvarCadastro(PassagensModel passagensModel) {
		passagensService.salvarCompra(passagensModel);
		return "redirect:/";
	}

	@GetMapping("/compra")
	public ModelAndView mostrarCadastro(PassagensModel passagensModel) {
		ModelAndView modelAndView = new ModelAndView("cadastro.html");
		return modelAndView;

	}	
}
