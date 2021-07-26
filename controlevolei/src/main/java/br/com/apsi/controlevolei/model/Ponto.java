package br.com.apsi.controlevolei.model;

import javax.persistence.*;

@Entity
public class Ponto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Column
	private boolean vantagem_nosso_time;

	@Column
	private EnumTipoPonto tipo_ponto;

	@Column
	private EnumTipoBloqueio tipo_bloqueio;

	@ManyToOne // um set poderá ter muitos pontos
	@JoinColumn(name = "ponto_id")
	private Ponto ponto;

	@ManyToOne // um jogador poderá ter muitos pontos
	@JoinColumn(name = "jogador_id")
	private Jogador jogador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isVantagem_nosso_time() {
		return vantagem_nosso_time;
	}

	public void setVantagem_nosso_time(boolean vantagem_nosso_time) {
		this.vantagem_nosso_time = vantagem_nosso_time;
	}

	public EnumTipoPonto getTipo_ponto() {
		return tipo_ponto;
	}

	public void setTipo_ponto(EnumTipoPonto tipo_ponto) {
		this.tipo_ponto = tipo_ponto;
	}

	public EnumTipoBloqueio getTipo_bloqueio() {
		return tipo_bloqueio;
	}

	public void setTipo_bloqueio(EnumTipoBloqueio tipo_bloqueio) {
		this.tipo_bloqueio = tipo_bloqueio;
	}

}
