package com.curso_funval;

import java.util.Scanner;
public class primeraClase {
	private static int numero;
	public void incrementoNumero() {
		numero++;
	}
	public static void main(String args[]) {
		
		primeraClase num = new primeraClase();
		// boolean resp = false;
		String res = "n";
		Scanner myObj = new Scanner(System.in);
		do {
			
			System.out.println("ingrese un numero entero");
			try{
				numero = myObj.nextInt();
				System.out.println("valor inicial :::: " + numero);
				num.incrementoNumero();
				System.out.println("valor final :::: " + numero);
				
				System.out.println("si desea continuar presione S, sino, N");
				
				res = myObj.next();
				
				System.out.println("tu respuesta: "+ res);
			}catch(Exception e) {
			   System.out.println("no es un número entero"); 
			   // Here catch NumberFormatException
			   // So input is not a int.
			 }

		}while((res.equals("s") || res.equals("S")));
	} 
}
