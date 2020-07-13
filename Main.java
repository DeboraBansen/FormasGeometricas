package com.mod.apresentacao;
import com.mod.dados.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {
	
	public static List<FormaGeometrica> formasgeometricas=new LinkedList<FormaGeometrica>();
	public static Scanner sc=new Scanner(System.in);
	public static Random aleatorio=new Random();
	
	public static void main(String[]  args) {
		
		criarCilindro();
		
		for(int i=1;i<=3;i++) {
			formasgeometricas.add(criarForma(i));
		}
	
		int op=-1;
		
		while(op!=0) {
			System.out.println("\nESCOLHA UMA OPÇAO A SEGUIR:");
			System.out.println("0- SAIR");
			System.out.println("1- ADICIONAR FORMA GEOMETRICA");
			System.out.println("2- MOSTRAR PERIMETRO");
			System.out.println("3- MOSTRAR AREA");
			op=sc.nextInt();
			
			switch(op) {
			case 0:
				break;
			case 1:
				adicionarFormaGeometrica();
				break;
			case 2:
				mostrarPerimetro();
				break;
			case 3:
				mostrarArea();
				break;
			default:
				break;
			}
			
		}
		
	}
	
	
	
	public static void adicionarFormaGeometrica() {
		int op=-1;
		
		System.out.println("\nESCOLHA UMA OPÇAO A SEGUIR:");
		System.out.println("0- SAIR");
		System.out.println("1- CIRCULO");
		System.out.println("2- RETANGULO");
		System.out.println("3- TRIANGULO");
		
		op=sc.nextInt();
		
		switch(op) {
		case 0:
			break;
		case 1:
			Circulo circulo=new Circulo();
			
			System.out.println("Digite o raio: ");
			circulo.setRaio(sc.nextDouble());
			
			formasgeometricas.add(circulo);
			break;
		case 2:
			Retangulo retangulo=new Retangulo();
			
			System.out.println("Digite a base do retangulo:");
			retangulo.setBase(sc.nextDouble());
			
			System.out.println("Digite a altura do retangulo:");
			retangulo.setAltura(sc.nextDouble());
			
			formasgeometricas.add(retangulo);
			break;
		case 3:
			Triangulo triangulo=new Triangulo();
			
			System.out.println("Digite o lado 1 do triangulo:");
			triangulo.setLados(sc.nextDouble());
			
			System.out.println("Digite o lado 1 do triangulo:");
			triangulo.setLados(sc.nextDouble());
			
			System.out.println("Digite o lado 1 do triangulo:");
			triangulo.setLados(sc.nextDouble());
			
			formasgeometricas.add(triangulo);
			break;
		default:
			break;
		}
	}
	
	public static void mostrarPerimetro() {
		DecimalFormat format=new DecimalFormat("0.00");
		System.out.println("\nPERIMETRO: "+format.format(formasgeometricas.get(formasgeometricas.size()-1).
								 calcularPerimetro()));
		
	}
	
	public static void mostrarArea() {
		DecimalFormat format=new DecimalFormat("0.00");
		System.out.println("\nAREA: "+format.format(formasgeometricas.get
							    (formasgeometricas.size()-1).calcularArea()));
	}
	
	public static FormaGeometrica criarForma(int tipo) {
		if(tipo==1) {
			Circulo circulo=new Circulo();
			
			circulo.setRaio(aleatorio.nextDouble()*100);
			
			System.out.println(circulo.toString());
			
			return circulo;
			
			}else {
				if(tipo==2) {
					Retangulo retangulo=new Retangulo();
					
					retangulo.setBase(aleatorio.nextDouble()*100);
					
					retangulo.setAltura(aleatorio.nextDouble()*100);
					
					System.out.println(retangulo.toString());
					
					return retangulo;
					
				}else {
					if(tipo==3) {
						Triangulo triangulo=new Triangulo();
	
						triangulo.setLados(aleatorio.nextDouble()*100);
						
						triangulo.setLados(aleatorio.nextDouble()*100);
						
						triangulo.setLados(aleatorio.nextDouble()*100);
						
						System.out.println(triangulo.toString());
						
						return triangulo;
						
					}else {
							System.out.println("numero invalido");
							return null;
						
					}
			   }		
		}
	}
	
	
	public static boolean isCirculo(FormaGeometrica forma) {
		if(forma instanceof Circulo) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isRetangulo(FormaGeometrica forma) {
		if(forma instanceof Retangulo) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isTriangulo(FormaGeometrica forma) {
		if(forma instanceof Triangulo) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void criarCilindro() {
		Cilindro cilindro=new Cilindro();
		
		Circulo circulo=new Circulo();
		circulo.setRaio(aleatorio.nextDouble()*100);
		
		Retangulo retangulo=new Retangulo();
		retangulo.setBase(aleatorio.nextDouble()*100);
		retangulo.setAltura(aleatorio.nextDouble()*100);
		
		cilindro.setBase(circulo);
		cilindro.setLateral(retangulo);
		
		System.out.println(cilindro.toString());
		
		
	}
	
}
