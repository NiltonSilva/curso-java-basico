package com.loiane.cursojava.aula36.labs;

public class Contato {
	
	private String nome;
	private String telefone;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String onterInfo() {
		return "Nome = " + nome + ";" +
				"Telefone = " + telefone + ";" + 
				"E-mail = " + email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int n1, n2, n3;
	
	
	
	
	public int menorNumero(int n1, int n2, int n3) {
		if(n1 <= n2 && n1 <= n3) {
			return n1;
		} else if (n2 <= n1 && n2 <= n3) {
			return n2;
		} else if (n3 <= n1 && n3 <= n2) {
			return n3;
		}
		return 0;
	}
}
