package Proyecto;

import java.util.Scanner;

public class Cubo {

	public static void main(String[] args) {
		
		System.out.println("Introduce el lado del cubo: ");
		double lado = introEntero();		
		double resultadovolumencubo = calcularVolumencubo(lado);
		verResultado(lado,resultadovolumencubo);		
	}
	
	public static double introEntero() {
		Scanner entrada = new Scanner(System.in);		
		return entrada.nextDouble();		
	}
	
	public static double calcularVolumencubo(double lado) {
		return lado * lado * lado;
	}
	
	public static void verResultado(double lado,double resultadovolumencubo) {
		System.out.println("El volumen del cubo es: " + resultadovolumencubo);
	}

	
}