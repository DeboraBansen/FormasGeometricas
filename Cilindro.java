package com.mod.dados;
import java.text.DecimalFormat;

public class Cilindro {
	private Circulo base;
	private Retangulo lateral;
	
	public Circulo getBase() {
		return base;
	}
	public void setBase(Circulo base) {
		this.base = base;
	}
	public Retangulo getLateral() {
		return lateral;
	}
	public void setLateral(Retangulo lateral) {
		this.lateral = lateral;
	}
	
	public double calcularArea() {
		return (this.lateral.calcularArea()+(2*this.base.calcularArea()));
	}
	
	public double calcularVolume() {
		return this.base.calcularArea()*this.lateral.getAltura();
	}
	
	public String toString() {
		DecimalFormat format=new DecimalFormat("0.00");
		return "\nCILINDRO"+
				"\nAREA: "+format.format(this.calcularArea())+
				"\nVOLUME: "+format.format(this.calcularVolume())+
				"\n";
	}
}
