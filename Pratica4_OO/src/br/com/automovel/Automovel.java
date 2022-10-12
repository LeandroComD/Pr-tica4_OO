package br.com.automovel;

public class Automovel {
	private String abs;
	private String airBag;
	private String alarme; 
	private String som;
	private String conjuntoEletrico;
	private String computadorDeBordo;
	private double precoBase = 30.000;
	
	public Automovel(String abs, String airBag, String alarme, String som, String conjuntoEletrico,
			String computadorDeBordo, Double precoBase) {
		super();
		this.abs = abs;
		this.airBag = airBag;
		this.alarme = alarme;
		this.som = som;
		this.conjuntoEletrico = conjuntoEletrico;
		this.computadorDeBordo = computadorDeBordo;
		this.precoBase = precoBase;
	}
	public String getAbs() {
		return abs;
	}
	public void setAbs(String abs) {
		this.abs = abs;
	}
	public String getAirBag() {
		return airBag;
	}
	public void setAirBag(String airBag) {
		this.airBag = airBag;
	}
	public String getAlarme() {
		return alarme;
	}
	public void setAlarme(String alarme) {
		this.alarme = alarme;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getConjuntoEletrico() {
		return conjuntoEletrico;
	}
	public void setConjuntoEletrico(String conjuntoEletrico) {
		this.conjuntoEletrico = conjuntoEletrico;
	}
	public String getComputadorDeBordo() {
		return computadorDeBordo;
	}
	public void setComputadorDeBordo(String computadorDeBordo) {
		this.computadorDeBordo = computadorDeBordo;
	}
	public Double getPrecoBase() {
		return precoBase;
	}
	public void setPrecoBase(Double precoBase) {
		this.precoBase = precoBase;
	}
	
	public String calcularPrecoFinal() {
		double total;
		int opcao;
		
		if (opcao = 1) {
			total=getPrecoBase()*(15/100);	
		}
		if (opcao = 2) {
			total=getPrecoBase()*(10/100);	
		}
		if (opcao = 3) {
			total=getPrecoBase()*(3/100);	
		}
		if (opcao = 4) {
			total=getPrecoBase()*(2/100);
		}
		if (opcao = 5) {
			total=getPrecoBase()*(5/100);	
		}
		if (opcao = 6) {
			total=getPrecoBase()*(10/100);	
		}
	
	}
	
}
