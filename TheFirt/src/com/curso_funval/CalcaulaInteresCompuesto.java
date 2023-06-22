package com.curso_funval;

import java.util.Scanner;

public class CalcaulaInteresCompuesto {
	public static double interesSimple(double principal, double tasainteres, double tiempo) {
		double interes = (principal * tasainteres * tiempo)/100;
		return interes;
	}
	public static double interesCompuesto(double principal, double tasainteres, double tiempo) {
		double interes = principal * Math.pow(1 + (tasainteres/100),tiempo) - principal;
		return interes;
	}
	
	public static void main(String[] args) {
		double principal =0, tasainteres = 0, tiempo = 0, interes_simple = 0, interes_compuesto =0;
		String res = "n";
		Scanner sc = new Scanner(System.in);
		 
		do {
			System.out.println("Calculo de interes compuesto");
			try{
				boolean continua = false;
				do {
					System.out.println("ingresa el monto : ");
					if(sc.hasNextDouble()) {
						principal = sc.nextDouble();
						sc.nextLine();
						continua = false;
					}else {
						continua = true;
						System.out.println("Ingrese un numero");
						sc.next();
					}
				}while(continua);
				do {
					System.out.println("ingresa la tasa de interes : ");
					if(sc.hasNextDouble()) {
						tasainteres = sc.nextDouble();
						sc.nextLine();
						continua = false;
					}else {
						continua = true;
						System.out.println("Ingrese un numero");
						sc.next();
					}
				}while(continua);
				if(tasainteres < 6) {
					do {
						System.out.println("ingresa los años : ");
						if(sc.hasNextDouble()) {
							tiempo = sc.nextDouble();
							sc.nextLine();
							continua = false;
						}else {
							continua = true;
							System.out.println("Ingrese un numero");
							sc.next();
						}
					}while(continua);
				}else {
					tiempo = 10;
					System.out.println("Para un interes mayor al 5% los años deben de ser 10 por default");
				}
				interes_simple = interesSimple( principal,  tasainteres,  tiempo);
				interes_compuesto = interesCompuesto( principal,  tasainteres,  tiempo);
				System.out.println("interes simple ::: "+ interes_simple);
				System.out.println("interes compuesto ::: "+ interes_compuesto);
				System.out.println("si desea continuar presione S, sino, N");
				res = sc.next();
				System.out.println("tu respuesta: "+ res);
			}catch(Exception e) {
			   System.out.println("no es un número entero"); 
			}

		}while((res.equals("s") || res.equals("S")));
	}
}
