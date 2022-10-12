package br.com.lojaComercial;

public class Administradores extends Funcionario {
	
	private double salarioFixo;
	private double horasExtras;


	
	public Administradores(String nome, String rg, double salarioFixo, double horasExtras) {
		super(nome, rg);
		this.salarioFixo = salarioFixo;
		this.horasExtras = horasExtras;
	}
	public double getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	public double getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public String calculaHoras() {
		double totalHoras= 0;
		totalHoras = (getSalarioFixo()/220)/0.100;
		return "O tata rececber é: " + (totalHoras + getSalarioFixo());
	}

}