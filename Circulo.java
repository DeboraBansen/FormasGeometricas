package com.mod.dados;
import java.text.DecimalFormat;

public class Circulo extends FormaGeometrica {
	private double raio;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return Math.PI*(raio*raio);
	}
	
	public double calcularPerimetro() {
		return 4*Math.PI*raio;
	}
	
	public String  toString() {
		DecimalFormat format=new DecimalFormat("0.00");
		return "CIRCULO"+
				"\nRaio: "+format.format(this.raio)+
				"\nAREA: "+format.format(this.calcularArea())+
				"\nPERIMETRO: "+format.format(this.calcularPerimetro())+
				"\n";
				
	}
}
