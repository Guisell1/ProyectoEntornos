package Proyecto;

import java.util.Scanner;

public class area_rectangulo {

	public static void main(String[] args) {		
		
		System.out.println("Introduce la base del rectángulo: ");
		double base = introEntero();
		System.out.println("Introduce la altura del rectángulo: ");
		double altura = introEntero();
		double resultado1 = calcularArearectangulo(base,altura);
		verResultado(base,altura,resultado1);

	}
	
	public static double introEntero() {
		Scanner entrada = new Scanner(System.in);		
		return entrada.nextDouble();
	}
	
	public static double calcularArearectangulo(double base, double altura) {
		
		return base * altura;
		
	}
	
	public static void verResultado(double base,double altura,double resultado1) {
		
		System.out.println("El área del rectángulo es: "+ resultado1);
		
	}

}
