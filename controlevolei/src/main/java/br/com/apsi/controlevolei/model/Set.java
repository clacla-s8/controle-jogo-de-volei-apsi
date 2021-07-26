package br.com.apsi.controlevolei.model;

import javax.persistence.*;

@Entity
public class Set {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id", updatable = false, nullable = false)
	 private Long id;	
	 
	 @Column
	 private int ponto_casa;
	 
	 @Column
	 private int ponto_adversario;
	 
	 @Column
	 private int numero_set;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPonto_casa() {
		return ponto_casa;
	}

	public void setPonto_casa(int ponto_casa) {
		this.ponto_casa = ponto_casa;
	}

	public int getPonto_adversario() {
		return ponto_adversario;
	}

	public void setPonto_adversario(int ponto_adversario) {
		this.ponto_adversario = ponto_adversario;
	}

	public int getNumero_set() {
		return numero_set;
	}

	public void setNumero_set(int numero_set) {
		this.numero_set = numero_set;
	}
	 
	 
	 
	 
}
