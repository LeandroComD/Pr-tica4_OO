package br.com.lojaComercial;
import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args) {
		
		String nome;
		String rg;
		int opcao;
		double salarioFixo;
		double horasExtras;
		double salarioBase;
		double vendas=0;
		double percentual;
		double acmVendas = 0;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Administrador\n<2> Vendedores\n<3> Sair"));
		
		
		nome = JOptionPane.showInputDialog("Nome do funcionario: ");
		rg = JOptionPane.showInputDialog("RG do funcionario: ");
		
		switch (opcao) {
		case 1:
			
			salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Informe o Salario Fixo: "));
			horasExtras = Double.parseDouble(JOptionPane.showInputDialog("Horas extras acumuladas: "));
			Administradores adm = new Administradores(nome, rg, salarioFixo, horasExtras);
			JOptionPane.showMessageDialog(null, adm.calculaHoras(), "Mensagem", JOptionPane.PLAIN_MESSAGE);
		break;
		case 2:
			salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Informe o Salario Base: "));
			Vendedores vende = new Vendedores(nome, rg, salarioBase,5, vendas);
			for(int i=0; i<3;i++) {
			vendas = Double.parseDouble(JOptionPane.showInputDialog("Total de vendas no dia " + (i+1) + "° :"));
			acmVendas = acmVendas +vendas;
			}
			JOptionPane.showMessageDialog(null, vende.calculaVendas(), "Mensagem", JOptionPane.PLAIN_MESSAGE);
			
		}
		
		

	}

}
