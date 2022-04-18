package com.loiane.cursojava.aula31;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km.");
	}
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {	
		return this.divideKMPorConsumoCombustivel(km);
	}
	
}
