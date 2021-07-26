package br.com.apsi.controlevolei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.apsi.controlevolei.model.Ponto;
import br.com.apsi.controlevolei.repository.PontoRepository;

@Service
@Transactional
public class PontoService {
	
	@Autowired
	private PontoRepository pontoRepo;
	
	public List<Ponto> listAll() {
        return pontoRepo.findAll();
    }
     
    public void save(Ponto Ponto) {
        pontoRepo.save(Ponto);
    }
     
    public Ponto get(long id) {
        return pontoRepo.findById(id).get();
    }
     
    public void delete(long id) {
        pontoRepo.deleteById(id);
    }

}
