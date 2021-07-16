package br.com.apsi.controlevolei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.apsi.controlevolei.model.Jogador;
import br.com.apsi.controlevolei.repository.JogadorRepository;

@Service
@Transactional
public class JogadorService {
	
	@Autowired
	private JogadorRepository repo;
	
	public List<Jogador> listAll() {
        return repo.findAll();
    }
     
    public void save(Jogador jogador) {
        repo.save(jogador);
    }
     
    public Jogador get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}
