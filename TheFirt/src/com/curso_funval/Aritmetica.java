package com.curso_funval;

public class Aritmetica {
	public double suma(double a, double b) {
		return a+b;
	}
	public double resta(double a, double b) {
		return a-b;
	}
	public double multiplicacion(double a, double b) {
		return a*b;
	}public double division(double a, double b) {
		if(b==0) {
			throw new ArithmeticException("El denominador no puede ser 0"); 
		}else {
			return a/b;
		}
	}
}
