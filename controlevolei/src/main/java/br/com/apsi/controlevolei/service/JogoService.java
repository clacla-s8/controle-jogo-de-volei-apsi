package br.com.apsi.controlevolei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.apsi.controlevolei.model.Jogo;
import br.com.apsi.controlevolei.repository.JogoRepository;

@Service
@Transactional
public class JogoService {
	
	@Autowired
	private JogoRepository jogoRepo;
	
	public List<Jogo> listAll() {
        return jogoRepo.findAll();
    }
     
    public void save(Jogo Jogo) {
        jogoRepo.save(Jogo);
    }
     
    public Jogo get(long id) {
        return jogoRepo.findById(id).get();
    }
     
    public void delete(long id) {
        jogoRepo.deleteById(id);
    }

}
