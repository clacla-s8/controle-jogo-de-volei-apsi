package br.com.apsi.controlevolei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apsi.controlevolei.model.Ponto;

public interface SetRepository extends JpaRepository<Ponto, Long>{

}
