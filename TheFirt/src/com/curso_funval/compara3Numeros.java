package com.curso_funval;
import java.util.Scanner;

public class compara3Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola te voy a decir cual es el valor más grande entre 3 numeros");
		
		System.out.println("ingresa el primer valor :::");
		double a = sc.nextDouble();
		System.out.println("ingresa el segundo valor :::");
		double b = sc.nextDouble();
		System.out.println("ingresa el tercer valor :::");
		double c = sc.nextDouble();
		
		if(a>b && a > c) {
			System.out.println("el mayor es :: "+ a);
			if(b>c) {
				System.out.println("el mener es :: "+ c);
			}else {
				System.out.println("el menor es :: "+ b);
			}
		}else if(b>a && b > c) {
			System.out.println("el mayor es :: "+ b);
			if(a>c) {
				System.out.println("el menor es :: "+ c);
			}else {
				System.out.println("el menor es :: "+ a);
			}
		}else if(c>a && c > b) {
			System.out.println("el mayor es :: "+ c);
			if(a>b) {
				System.out.println("el menor es :: "+ b);
			}else{
				System.out.println("el menor es :: "+ a);
			}
		}else if(a == b) {
			if(a>c) {
				System.out.println("el mayor es :: "+ a);
				System.out.println("el menor es :: "+ c);
			}else{
				System.out.println("el mayor es :: "+ c);
				System.out.println("el menor es :: "+ a);
			}
		}else if(a == c) {
			if(b>c) {
				System.out.println("el mayor es :: "+ b);
				System.out.println("el menor es :: "+ c);
			}else{
				System.out.println("el mayor es :: "+ c);
				System.out.println("el menor es :: "+ b);
			}
		}else if(b == c) {
			if(a>c) {
				System.out.println("el mayor es :: "+ a);
				System.out.println("el menor es :: "+ c);
			}else{
				System.out.println("el mayor es :: "+ c);
				System.out.println("el menor es :: "+ a);
			}
		}
	}

}
