package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrion");
		// contato.setEndereco("Rua Kings Landing");
		// contato.setTelefone("11 9.9999-9999");
		
		// Relacionamento tem-um Endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("99.999-999");
		
		contato.setEndereco(end);
		
		// Relacionamento tem-um Telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("85");
		telefone.setNumero("9.9999-9999");
		
		//contato.setTelefone(telefone);
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("85");
		telefone2.setNumero("8.8888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		// Teste saída no console		
		System.out.println(contato.getNome());
		// System.out.println(contato.getTelefone());
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if(contato !=  null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		};

	}

}
