package br.com.apsi.controlevolei.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.apsi.controlevolei.model.Partida;
import br.com.apsi.controlevolei.service.PartidaService;
import br.com.apsi.controlevolei.service.PontoService;

@Controller
@RequestMapping("/partidas")
public class PartidaController {
	
	@Autowired
	private PartidaService partidaService;
	
	@Autowired
	private PontoService pontoService;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Partida partida) {
		return "/partida/cadastrar";
	}

	@PostMapping("/salvar")
	public String salvar(@Valid Partida partida, BindingResult result, RedirectAttributes attr) {

		partidaService.save(partida);
		attr.addAttribute("success", "Jogo cadastrado com sucesso.");
		return "redirect:/";
	}

}
