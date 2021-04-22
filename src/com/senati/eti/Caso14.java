package com.senati.eti;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		//SUMATORIA
		// N = 4
		// R = 1 + 2 + 3 + 4 ---> 10
		// R = (4 x (4+1)) / 2 ---> 10
		int r = (n * (n + 1)) / 2;
		
		System.out.println("\nR E S U L T A D O S");
        System.out.println("-----------------------");
        System.out.println("Sumatoria......: " + r);
		
		
		
		
		

	}

}
