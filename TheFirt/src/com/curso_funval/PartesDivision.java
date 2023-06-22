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
		System.out.println("El residuo es: "+ residuo);
	}
	public void muestraDivision() {
		System.out.println("El resultado de la division es: "+ division);
	}
	public static void main(String[] args) {
		PartesDivision pd = new PartesDivision();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese dividendo : ");
		pd.setDividendo(sc.nextInt());
		sc.nextLine();
		System.out.println("Ingrese divisor : ");
		pd.setDivisor(sc.nextInt());
		sc.nextLine();
		
		pd.muestraCociente();
		pd.muestraResiduo();
		pd.muestraDivision();
	}

}
