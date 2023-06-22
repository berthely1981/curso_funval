package com.curso_funval;

public class Compara2Numeros {
	private int numero1;
	private int numero2;
	public Compara2Numeros(int a, int b) {
		numero1 = a;
		numero2 = b;
	}
	
	public int elMayor() {
		int resp = numero2;
		if(numero1 > numero2) {
			resp = numero1;
		}else if(numero1 == numero2) {
			resp = 0;
		}
		return resp;
	}
}
