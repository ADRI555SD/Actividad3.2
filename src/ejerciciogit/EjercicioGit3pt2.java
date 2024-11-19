package ejerciciogit;

import java.util.Scanner;
/**
 * Realiza una suma y una resta entre dos numeros.
 * Los numeros son introducidos por un usuario.
 * 
 * @author Adrià Rocha Coll
 * @version 1.2
 */
public class EjercicioGit3pt2 {
	
	public static void main(String[] args) {
		/**
		 * El ordenador pide al usuario que introduzca dos numeros de su interes
		 * Los numeros introduzidos por el usuario son almazenados dentro de los parametrod "numero1" y "numero2"
		 * 
		 * @parametro a el primer numero
		 * @parametro b el segundo numero
		 */
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
	/**
	 * @return la suma de <code>a</code> y <code>b</code>
	 */
	public static double sumar(double a, double b) { // Equación suma
		return a + b;
	}
		
	public static double restar(double a, double b) { // Equación resta
		return a - b;
	}
		// Este comentario se ha hecho desde GitHub


}
