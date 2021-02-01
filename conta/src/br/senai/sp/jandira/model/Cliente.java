package br.senai.sp.jandira.model;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String telefone;
	private String cep;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf ( String cpf) {
		
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public  void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return this.telefone ;
	}
	
	public void setCep (String cep) {
		this.cep = cep;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	
	
}
