package Proyecto;

import java.util.Scanner;

public class area_y_perimetro_circunferencia {

	public static void main(String[] args) {
		
		System.out.println("Introduce el radio de la circunferencia: ");
		double radio = introEntero();
		double pi = 3.14159;
		double resultadoareacircun = calcularAreacircunf(radio,pi);
		double resultadoperimcircun = calcularPerimetrocircunf(radio,pi);
		verResultado(radio,resultadoareacircun,resultadoperimcircun);
	}
	
	
	public static double introEntero() {
		Scanner entrada = new Scanner(System.in);		
		return entrada.nextDouble();
	}
	
	
	public static double calcularAreacircunf(double radio,double pi){
		
		return pi * (radio * radio) ;		
	}
	
	public static double calcularPerimetrocircunf(double radio,double pi) {
		
		return (2 * pi) * radio;
	}
	
	public static void verResultado (double radio,double resultadoareacircun,double resultadoperimcircun) {
		System.out.println("El radio de la circunferencia es: " + radio);
		System.out.println("El area de la circunferencia es: " + resultadoareacircun);
		System.out.println("El perímetro de la circunferencia es: " + resultadoperimcircun);
	}
	
}
