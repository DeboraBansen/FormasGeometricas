package com.mod.dados;
import java.text.DecimalFormat;

public class Retangulo extends FormaGeometrica {
	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		return base*altura;
	}
	
	public double calcularPerimetro() {
		return 2*base+(2*altura);
	}
	
	public String toString() {
		DecimalFormat format=new DecimalFormat("0.00");
		return "RETANGULO"+
				"\nBase: "+(format.format(this.base))+
				"\nAltura: "+format.format(this.altura)+
				"\nAREA: "+format.format(this.calcularArea())+
				"\nPERIMETRO: "+format.format(this.calcularPerimetro())+
				"\n";
				
	}
}
