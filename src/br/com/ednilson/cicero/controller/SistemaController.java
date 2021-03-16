package br.com.ednilson.cicero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sistema")
public class SistemaController {
	@GetMapping(value = "/boasvindas")
	public ModelAndView boasVindas(
			@RequestParam(value = "nome", required = false, defaultValue = "Cícero Ednilson") String nome) {

		ModelAndView modelAndView = new ModelAndView("boasVindas");
		modelAndView.addObject("mensagem", "Olá " + nome);

		return modelAndView;
	}

}
