package com.loiane.cursojava.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro() {

	}
	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o contrutor 3 parâmetros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando o contrutor 2 parâmetros");
	}

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {

		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km.");
	}
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {	
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}
	
}
