package br.com.apsi.controlevolei.model;

public enum EnumTipoBloqueio {
	
	SAQUE(1), CONTRA_ATAQUE(2), ATAQUE(3), BLOQUEIO(4), ERRO_ADVERSARIO(5);
	
	private int bloqueio;

	private EnumTipoBloqueio(int bloqueio) {
		this.bloqueio = bloqueio;
	}

	public int getBloqueio() {
		return bloqueio;
	}

	public void setBloqueio(int bloqueio) {
		this.bloqueio = bloqueio;
	}
	
	

}
