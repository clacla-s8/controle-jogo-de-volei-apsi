package br.com.apsi.controlevolei.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import br.com.apsi.controlevolei.model.Jogo;
import br.com.apsi.controlevolei.service.JogoService;

@Controller
@RequestMapping("/jogos")
public class JogoController {
	
	@Autowired
	private JogoService jogoService;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Jogo jogo) {
		return "/jogo/cadastrar";
	}

	@PostMapping("/salvar")
	public String salvar(@Valid Jogo jogo, BindingResult result, RedirectAttributes attr) {

		jogoService.save(jogo);
		attr.addAttribute("success", "Jogo cadastrado com sucesso.");
		return "redirect:/";
	}

}
