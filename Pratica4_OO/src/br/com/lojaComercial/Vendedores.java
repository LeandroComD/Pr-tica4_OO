package br.com.lojaComercial;

import javax.swing.JOptionPane;

public class Vendedores extends Funcionario{
	
	private double salarioBase;
	private int percentual=5;
	private double vendas=0;
	
	
	
	

	public Vendedores(String nome, String rg, double salarioBase, int percentual, double vendas) {
		super(nome, rg);
		this.salarioBase = salarioBase;
		this.percentual = percentual;
		this.vendas = vendas;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getPercentual() {
		return percentual;
	}

	public void setPercentual(int percentual) {
		this.percentual = percentual;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public String calculaVendas() {
		double acmVendas =0;
		
		/*for(int i=0; i<3;i++) {
			vendas = Double.parseDouble(JOptionPane.showInputDialog("Total de vendas no dia " + (i+1) + "° :"));
			acmVendas = acmVendas + vendas;
			}*/
		return "O total a receber é: " + (((getPercentual()/100)*acmVendas) + getSalarioBase());
		}
	
}
	
