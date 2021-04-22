package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		// CAST --> Convertir de un tipo de dato a otro
		
		int rpta1 = (int) Math.pow(5, 3);
		// Raiz cuadrada --> base elevada a la inversa del expo.
		double rpta2 = (float) Math.pow(81, 1/2.0);
		double rpta3 = (float) Math.pow(125, 1/3.0);
		double rpta4 = (float) Math.pow(256, 1/4.0);
		double rpta5 = (float) Math.pow(25, 1/2.0);
		
		System.out.println("\nNúmeros Ingresados");
        System.out.println("--------------------");
        System.out.println("Respuesta 1.............: " + rpta1);
        System.out.println("Respuesta 2.............: " + rpta2);
        System.out.println("Respuesta 3.............: " + rpta3);
        System.out.println("Respuesta 4.............: " + (rpta4 + rpta5));

	}

}
