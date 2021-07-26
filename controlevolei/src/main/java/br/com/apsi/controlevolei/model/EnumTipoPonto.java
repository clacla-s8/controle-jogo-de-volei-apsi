package br.com.apsi.controlevolei.model;

public enum EnumTipoPonto {

	INDIVIDUAL(1), DUPLO(2), TRIPLO(3);
	
	private int ponto;

	private EnumTipoPonto(int ponto) {
		this.ponto = ponto;
	}

	public int getPonto() {
		return ponto;
	}

	public void setPonto(int ponto) {
		this.ponto = ponto;
	}
	
	
}
