package com.curso_funval;

import java.util.LinkedList;
import java.util.Scanner;

public class mediaXNumeros {
	public static LinkedList<Double> numeros = new LinkedList<Double>();

	public static void addNumeros(double numero) {
		numeros.add(numero);
	}
	
	public static double calculaMedia() {
		double total_suma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			total_suma+=numeros.get(i);
        }
		return total_suma/numeros.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos enteros quieres ingresar? El maximo son 10::: ");
		int total_enteros = sc.nextInt();
		sc.nextLine();
		total_enteros = total_enteros> 10 ? 10: total_enteros;
		
		for(int i = 1;i < total_enteros+1; ++i) {
			System.out.println("Ingrese el entero numero " + i);
			double numero = sc.nextDouble();
			addNumeros(numero);
			sc.nextLine();
		}
		
		System.out.print("El resultado es: "+ calculaMedia());
		sc.close();
	}

}
