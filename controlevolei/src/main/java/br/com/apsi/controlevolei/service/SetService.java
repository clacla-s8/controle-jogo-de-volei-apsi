package br.com.apsi.controlevolei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import br.com.apsi.controlevolei.model.Set;
import br.com.apsi.controlevolei.repository.SetRepository;

@Service
@Transactional
public class SetService {
	
	@Autowired
	private SetRepository setRepository;
	
	public List<Set> listAll() {
        return setRepository.findAll();
    }
     
    public void save(Set set) {
        setRepository.save(set);
    }
     
    public Set get(long id) {
        return setRepository.findById(id).get();
    }
     
    public void delete(long id) {
        setRepository.deleteById(id);
    }

}
