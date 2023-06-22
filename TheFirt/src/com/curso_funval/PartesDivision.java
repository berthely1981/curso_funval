package com.curso_funval;

import java.util.Scanner;

public class PartesDivision {
	private int cociente;
	private int residuo;
	private int dividendo;
	private int divisor;
	private float division;
	
	public int getCociente() {
		return cociente;
	}

	public void setCociente(int cociente) {
		this.cociente = cociente;
	}

	public int getResiduo() {
		return residuo;
	}

	public void setResiduo(int residuo) {
		this.residuo = residuo;
	}

	public int getDividendo() {
		return dividendo;
	}

	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	public void muestraCociente() {
		division = (float)dividendo/(float)divisor;
		cociente = (int)division;
		System.out.println("El cociente es: "+ cociente);
	}
	public void muestraResiduo() {
		residuo = dividendo - divisor * cociente;
		residuo = residuo < 0 ? (-1  * residuo) : residuo;
		System.out.println("El residuo es: "+ residuo);
	}
	public void muestraDivision() {
		System.out.println("El resultado de la division es: "+ division);
	}
	public static void main(String[] args) {
		PartesDivision pd = new PartesDivision();
		Scanner sc = new Scanner(System.in);
		boolean continua = false;
		do {
			System.out.println("Solo numeros enteros, Ingrese dividendo : ");
			if(sc.hasNextInt()) {
				pd.setDividendo(sc.nextInt());
				sc.nextLine();
				continua = false;
			}else {
				continua = true;
				System.out.println("Ingrese un entero");
				sc.next();
			}
			
		}while(continua);
		do {
			System.out.println("Solo numeros enteros, Ingrese divisor : ");
			if(sc.hasNextInt()) {
				pd.setDivisor(sc.nextInt());
				sc.nextLine();
				continua = false;
			}else {
				continua = true;
				System.out.println("Ingrese un entero");
				sc.next();
			}
			
		}while(continua);
		
		pd.muestraCociente();
		pd.muestraResiduo();
		pd.muestraDivision();
	}

}
