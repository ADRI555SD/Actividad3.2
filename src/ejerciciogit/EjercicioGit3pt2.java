package ejerciciogit;

import java.util.Scanner;

public class EjercicioGit3pt2 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Calculadora Simple:"); // Nombre
		
		System.out.print("Introduce el primer número: "); // Pregunta suma
		double numero1 = scanner.nextDouble();      
		
		System.out.print("Introduce el segundo número: "); // Pregunta resta
		double numero2 = scanner.nextDouble();   
		
		double resultadoSuma = sumar(numero1, numero2);
		double resultadoResta = restar(numero1, numero2);
		
		System.out.println("Resultado de la suma: " + resultadoSuma); // Resultado suma
		
		System.out.println("Resultado de la resta: " + resultadoResta); // Resultado resta
		
		scanner.close();
		
	}
	
	public static double sumar(double a, double b) { // Equación suma
		return a + b;
	}
		
	public static double restar(double a, double b) { // Equación resta
		return a - b;
	}
		


}
