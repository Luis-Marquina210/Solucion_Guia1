package com.senati.eti;

// Importando la libreria para la lectura de datos
import java.util.Scanner;

public class Caso2 {

	private static final String system = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Instancia a la clase Scanner 
		Scanner sc = new Scanner(System.in);
		
		// Declara la variable y asignar un valor 
		int numero = 0;
		
		//Lectura 
		System.out.print("Ingrese número: ");
		numero = sc.nextInt();
		
		// Impresión
		System.out.println("\nNúmero Ingresado");
		System.out.println("------------------");
		System.out.println("Número.......: " + numero);
		
	}

}




