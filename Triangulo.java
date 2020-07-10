package com.mod.dados;
import java.text.DecimalFormat;

public class Triangulo extends FormaGeometrica {
	private double [] lados=new double[3];
	private int qtd=0;
	
	public double[] getLados() {
		return lados;
	}

	public void setLados(double lado) {
		if(qtd<3) {
		this.lados[qtd] = lado;
		qtd++;
		}
	}

	public double calcularArea() {
		
		double p=((this.lados[0]+this.lados[1]+this.lados[2])/2);
		
		double q=((p-this.lados[0])*(p-this.lados[1])*(p-this.lados[2]));
		
		return Math.sqrt(p*q);
	}
	
	public double calcularPerimetro() {
		return this.lados[0]+this.lados[1]+this.lados[2];
	}
	
	public String toString() {
		DecimalFormat format=new DecimalFormat("0.00");
		return	"TRIANGULO"+
				"\nLado 1: "+format.format(this.lados[0])+
				"\nLado 2: "+format.format(this.lados[1])+
				"\nLado 3: "+format.format(this.lados[2])+
				"\nAREA: "+format.format(this.calcularArea())+
				"\nPERIMETRO: "+format.format(this.calcularPerimetro())+
				"\n";
		
	}
}
