package com.curso_funval;

import java.util.Scanner;

public class PersonasEdad {
	public void respuesta(Compara2Numeros cn, Persona p1, Persona p2){
		if(cn.elMayor() == 0) {
			System.out.println("tienen la misma edad");
		}else if(cn.elMayor() == p1.getEdad()) {
			System.out.println("El mayor es : "+ p1.getNombre());
		}else {
			System.out.println("El mayor es : "+ p2.getNombre());
		}
		
	}
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		PersonasEdad pe = new PersonasEdad();
		
		p1.obtenerDato(sc);
		p2.obtenerDato(sc);
		Compara2Numeros cn = new Compara2Numeros(p1.getEdad(), p2.getEdad());
		pe.respuesta(cn, p1, p2);
		sc.close();
	}
}
