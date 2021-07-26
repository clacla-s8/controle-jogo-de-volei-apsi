package br.com.apsi.controlevolei.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column
	private String local;

	@Column
	private String time_adversario;

	@Column
	private String juiz;

	@Column
	private String juiz_auxiliar;

	@Column
	private LocalDateTime data_hora;

	@OneToMany(mappedBy = "jogo")
	private List<Set> sets;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTime_adversario() {
		return time_adversario;
	}

	public void setTime_adversario(String time_adversario) {
		this.time_adversario = time_adversario;
	}

	public String getJuiz() {
		return juiz;
	}

	public void setJuiz(String juiz) {
		this.juiz = juiz;
	}

	public String getJuiz_auxiliar() {
		return juiz_auxiliar;
	}

	public void setJuiz_auxiliar(String juiz_auxiliar) {
		this.juiz_auxiliar = juiz_auxiliar;
	}

	public LocalDateTime getData_hora() {
		return data_hora;
	}

	public void setData_hora(LocalDateTime data_hora) {
		this.data_hora = data_hora;
	}

}
