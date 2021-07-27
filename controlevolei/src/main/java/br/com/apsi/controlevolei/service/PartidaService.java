package br.com.apsi.controlevolei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import br.com.apsi.controlevolei.model.Partida;
import br.com.apsi.controlevolei.repository.PartidaRepository;

@Service
@Transactional
public class PartidaService {
	
	@Autowired
	private PartidaRepository partidaRepository;
	
	public List<Partida> listAll() {
        return partidaRepository.findAll();
    }
     
    public void save(Partida partida) {
        partidaRepository.save(partida);
    }
     
    public Partida get(long id) {
        return partidaRepository.findById(id).get();
    }
     
    public void delete(long id) {
        partidaRepository.deleteById(id);
    }

}
