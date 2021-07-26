package br.com.apsi.controlevolei.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.apsi.controlevolei.model.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{

}
