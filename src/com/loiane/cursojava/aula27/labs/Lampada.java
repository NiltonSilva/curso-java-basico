package com.loiane.cursojava.aula27.labs;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;
	boolean ligada;
	
	public void ligar() {
		this.ligada = true;
		System.out.println("Lâmpada ligada");
	}
	
	public void desligar() {
		this.ligada = false;
		System.out.println("Lâmpada desligada");
	}
	
	
}
