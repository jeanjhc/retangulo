package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		//  conta da ana
		Conta contaAnaGomes = new Conta();
		Conta contaDoJoao = new Conta();
		
//		contaAnaGomes.setTitular("Ana Gomes");
		contaAnaGomes.setNumero("111-98");
		contaAnaGomes.setTipo("Corrente");
		contaAnaGomes.setAtiva(true);
		contaAnaGomes.setChequeEspecial(200);
		contaAnaGomes.depositar(100);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.depositar(30);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(50);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(500);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(50);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.sacar(80);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.depositar(100);
		contaAnaGomes.mostrarSaldoDaConta();
		contaAnaGomes.getSaldo();
		
		
		double a = contaAnaGomes.getSaldo() *2;
		System.out.println("****" + contaAnaGomes.getSaldo());
		
		
		
		double saldoDaConta = contaAnaGomes.getSaldo();
		System.out.println("o saldo da conta é " + saldoDaConta);
		
//		System.out.println("Nome: "+contaAnaGomes.getTitular());
		System.out.println("Tipo: " + contaAnaGomes.getTipo());
		System.out.println("Conta: "+contaAnaGomes.getNumero());
//		System.out.println( "Limite: "+contaAnaGomes.getChequeEspecisal());
		
		Cliente cliente = new Cliente();
		
		contaAnaGomes.isAtiva();
		
		//*** Conta do João
		contaDoJoao.setTipo("Corrente");
		
		
	}
}
