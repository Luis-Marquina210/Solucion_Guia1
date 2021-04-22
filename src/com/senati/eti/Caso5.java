package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			float num1 = 0, num2 = 0;
			
			System.out.print("Ingrese primer número.....: ");
	        num1 = sc.nextFloat();
	        
	        
	        System.out.print("Ingrese segundo Número.....: ");
	        num2 = sc.nextFloat();	
		
	        float prom = (num1 + num2) / 2;
	        double aume = (num1 * 0.2);
	        double dismi = (num2 * 0.3);
	        
	        System.out.println("\nR E S U L T A D O S");
	        System.out.println("-----------------------");
	        System.out.println("Resultado 1............: " + prom);
	        System.out.println("Resultado 2............: " + (aume + num1));
	        System.out.println("Resultado 3............: " + (num2 - dismi));
	        
	        
	        
	        
	        
	        
	        
	        

	}

}
