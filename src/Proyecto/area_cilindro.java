package Proyecto;

import java.util.Scanner;

public class area_cilindro {

	public static void main(String[] args) {
		
		System.out.println("Introduce el radio de la base del cilindro: ");
		double radio = introEntero();
		double pi = 3.14159;
		System.out.println("Introduce la altura del cilindro: ");
		double altura = introEntero();		
		double resultadoradiocilindro = calcularRadiocilindro(radio,pi);	
		double resultadoalturacilindro = calcularAlturacilindro(radio,pi,altura);
		double resultadototal = calcularAreatotal(resultadoradiocilindro,resultadoalturacilindro);
		
		verResultado(resultadototal);

	}
	
	public static double introEntero() {
		Scanner entrada = new Scanner(System.in);		
		return entrada.nextDouble();		
	}
	
	public static double calcularRadiocilindro(double radio, double pi) {
		
		return (2.00 * pi * (radio * radio));
		
	}
	
	public static double calcularAlturacilindro(double radio, double altura , double pi) {
		
		return (2.00 * pi * radio * altura);
		
	}	
	
	
	public static double calcularAreatotal(double resultadoradiocilindro,double resultadoalturacilindro) {
		
		return resultadoradiocilindro + resultadoalturacilindro;
		
	}	
	
	
	public static void verResultado(double resultadototal) {
		System.out.println("El alrea del cilindro es: " + resultadototal);
	}

	
	

}
