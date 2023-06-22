package com.curso_funval;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductoNEnteros {
	public static LinkedList<Integer> enteros = new LinkedList<Integer>();

	public static void addEnteros(int entero) {
		enteros.add(entero);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos enteros quiere multiplicar? El maximo son 5::: ");
		int total_enteros = sc.nextInt();
		sc.nextLine();
		total_enteros = total_enteros> 5 ? 5: total_enteros;
		
		
		long resultado = 1;
		for(int i = 1;i < total_enteros+1; ++i) {
			System.out.println("El maximo es 999. Ingrese el entero numero " + i);
			int entero = sc.nextInt();
			entero = entero> 999 ? 999: entero;
			addEnteros(entero);
			sc.nextLine();
		}
		for (int i = 0; i < enteros.size(); i++) {
			resultado*=enteros.get(i);
        }
		System.out.print("El resultado es: "+ resultado);
		sc.close();
	}

}
