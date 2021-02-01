package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;

import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
		
		// Criação do Cliente
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro Alves Cabral");
		pedro.setCpf("5562323565");
		pedro.setTelefone("(11)4144-0798");
		pedro.setCep("066877897");
		
		// Criar da conta pedro
		Conta contaPedro = new Conta();
		contaPedro.setTitular(pedro);
		contaPedro.depositar(100);
		contaPedro.setNumero("222-2");
		System.out.println(contaPedro.getTitular().getTelefone());
		                   /* cliente*****/
		System.out.println(contaPedro.getTitular().getNome());
		contaPedro.getTitular().setNome("Pedro Jose");
		System.out.println(contaPedro.getTitular().getNome());
		
	}

}
