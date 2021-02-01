package br.senai.sp.jandira.model;

public class Conta {
	
	private String tipo;
	private double saldo;
	private String numero;
	private Cliente titular;
	private boolean ativa;
	private double chequeEspecial;
	
	//*** Métodos de acesso aos atributos da classe
	//*** getters and setters 
	
	public void setTitular(Cliente titular) {
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTipo(String tipo) {
		if(tipo.equals("Corrente") || tipo.equals("Poupança")) {
			this.tipo = tipo;
		}else {
			System.out.println("O tipo deve ser Corrente ou Poupança");
		}
		
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	
	
	
	public boolean isAtiva() {
		return 
				this.ativa;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public  String getNumero () {
		return this.numero;
	}
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public void depositar(double valorDeposito) {
		
		if (valorDeposito < 0) {
			System.out.println("Valor inválido!!!");
		} else {
			saldo += valorDeposito;
		}
		
	}
	
	public void mostrarSaldoDaConta() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Saldo + Limite: " + (saldo + chequeEspecial));
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void sacar(double valorDoSaque) {
		
		if ((saldo + chequeEspecial) >= valorDoSaque) {
			saldo -= valorDoSaque;
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		
	}
	
	public void transferir() {
		
	}

}
