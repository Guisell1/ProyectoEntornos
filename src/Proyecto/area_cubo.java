package Proyecto;

import java.util.Scanner;

public class area_cubo {

	public static void main(String[] args) {
		System.out.println("Introduce el lado del cubo: ");
		double lado = introEntero();		
		double resultadoareacubo = calcularAreacubo(lado);
		verResultado(lado,resultadoareacubo);

	}
	
	public static double introEntero() {
		Scanner entrada = new Scanner(System.in);		
		return entrada.nextDouble();		
	}
	
	public static double calcularAreacubo(double lado) {
		return 6 * (lado * lado);
	}
	
	public static void verResultado(double lado,double resultadoareacubo) {
		System.out.println("El area del cubo es: " + resultadoareacubo);
	}

}
