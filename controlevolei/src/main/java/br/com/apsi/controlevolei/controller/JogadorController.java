package br.com.apsi.controlevolei.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.apsi.controlevolei.model.Jogador;
import br.com.apsi.controlevolei.service.JogadorService;

@Controller
@RequestMapping("/jogadores")
public class JogadorController {

	@Autowired
	private JogadorService jogadorService;

	@GetMapping("/cadastrar")
	public String cadastrar(Jogador jogador) {
		return "/jogador/cadastrar";
	}

	@PostMapping("/salvar")
	public String salvar(@Valid Jogador jogador, BindingResult result, Model model) {

		jogadorService.save(jogador);
		model.addAttribute("success", "Jogador cadastrado com sucesso.");
		return "redirect:/";
	}

}
