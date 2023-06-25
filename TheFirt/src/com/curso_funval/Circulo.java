package com.curso_funval;

public class Circulo {
	private double pi = 3.14;
	private double area;
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void calculaArea(double r) {
		setArea(r*r*pi);
	}
}
