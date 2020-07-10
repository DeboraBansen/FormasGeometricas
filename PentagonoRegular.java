package com.mod.dados;

public class PentagonoRegular extends FormaGeometrica {
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		double a=10*Math.sqrt(5);
		double p=Math.sqrt(25+a);
		double b=this.lado*this.lado;
		return (b*p)/4;
	}
	 public double calcularPerimetro() {
		 return 5*this.lado;
	 }

}
