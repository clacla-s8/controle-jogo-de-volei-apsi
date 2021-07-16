package br.com.apsi.controlevolei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apsi.controlevolei.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {

}
