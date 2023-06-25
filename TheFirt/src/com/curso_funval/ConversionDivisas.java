package com.curso_funval;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConversionDivisas {
	static String m_entrada = "";
	public static double peso_dolar = 0.05;

	public static double peso_quetzal = 0.45;

	public static double peso_sol = 0.21;
	
	public static double dolar_peso = 1/peso_dolar;
	
	public static double dolar_quetzal = 7.76;
	
	public static double dolar_sol = 3.61;
	
	public static double quetzal_peso= 1/peso_quetzal;
	
	public static double quetzal_dolar = 1/dolar_quetzal;
	
	public static double quetzal_sol =2.16;
	
	public static double sol_peso = 1/peso_sol;
	
	public static double sol_dolar = 1/dolar_sol;

	public static double sol_quetzal = 1/quetzal_sol;

	public static double valorPesos(double sub_total, String moneda_salida) {
		if(moneda_salida.equals("d")) {
			sub_total = sub_total*dolar_peso;
		}else if(moneda_salida.equals("s")) {
			sub_total = sub_total*sol_peso;
		}else if(moneda_salida.equals("q")) {
			sub_total = sub_total*quetzal_peso;
		}
		return sub_total;
	}
		
	public static double conversion(double total_entrada, String moneda_entrada, String moneda_salida) {
		double resultado = 0;
		double valor_pesos = 0;
		switch(moneda_entrada) {
			case "p":
				if(moneda_salida.equals("d")) {
					resultado = total_entrada * peso_dolar;
				}else if(moneda_salida.equals("s")){
					resultado = total_entrada * peso_sol;
				}else if(moneda_salida.equals("q")){
					resultado = total_entrada * peso_quetzal;
				}else {
					resultado = total_entrada;
				}
				break;
			case "d":
				if(moneda_salida.equals("p")) {
					resultado = total_entrada * dolar_peso;
				}else if(moneda_salida.equals("s")){
					resultado = total_entrada * dolar_sol;
				}else if(moneda_salida.equals("q")){
					resultado = total_entrada * dolar_quetzal;
				}
				break;
			case "s":
				if(moneda_salida.equals("p")) {
					resultado = total_entrada * sol_peso;
				}else if(moneda_salida.equals("d")){
					resultado = total_entrada * sol_dolar;
				}else if(moneda_salida.equals("q")){
					resultado = total_entrada * sol_quetzal;
				}
				break;
			case "q":
				if(moneda_salida.equals("p")) {
					resultado = total_entrada * quetzal_peso;
				}else if(moneda_salida.equals("d")){
					resultado = total_entrada * quetzal_dolar;
				}else if(moneda_salida.equals("s")){
					resultado = total_entrada * quetzal_sol;
				}
				break;
		}
		return resultado; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m_salida = "";
		boolean continua = false;
		double monto = 0;
		double sub_total = 0;
		double total = 0;
		double valor_pesos = 0;
		double valor_pesos_pct = 0;
		double descuento = 0;
		String porcentaje_str =""; 
		double porcentaje = 0; 
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("p","pesos");
		map.put("s","soles");
		map.put("q","quetzales");
		map.put("d","dolares");
		
		do {
			System.out.println("Seleccione la moneda que va a cambiar");
			map.forEach((k, v) -> System.out.println("Para " + v + " presione :"+ k ));
			m_entrada = sc.nextLine();
			continua = !map.containsKey(m_entrada);
			if(continua) {
				System.out.println("Ingrese una de las opciones");
			}
		}while(continua);
		
		do {
			System.out.println("Seleccione la moneda que desea obtener");
			map.forEach((k, v) -> {
				if(!k.equals(m_entrada)) System.out.println("Para " + v + " presione :"+ k );
			});
			m_salida = sc.nextLine();
			continua  = !map.containsKey(m_salida);
			if(continua) {
				System.out.println("Ingrese una de las opciones");
			}
		}while(continua);
		
		do {
			System.out.println("ingresa el monto : ");
			if(sc.hasNextDouble()) {
				monto = sc.nextDouble();
				sc.nextLine();
				continua = false;
			}else {
				continua = true;
				System.out.println("Ingrese un numero");
				sc.next();
			}
		}while(continua);
		
		sub_total = conversion(monto, m_entrada, m_salida);
		System.out.println("Ingresó "+ monto +" "+map.get(m_entrada));
		System.out.println("Subtotal "+ sub_total +" "+map.get(m_salida));
		valor_pesos = valorPesos(sub_total, m_salida);
		if(valor_pesos > 50) {
			porcentaje_str = "10";
			porcentaje = 0.10;
		}else {
			porcentaje_str = "5";
			porcentaje = 0.05;
		}
		System.out.println("Lo obtenido en pesos es : "+ valor_pesos+ " el iva es del "+ porcentaje_str+"%");
		valor_pesos_pct = valor_pesos * porcentaje;
		System.out.println("Esto equivale a : "+ valor_pesos_pct + " pesos ");
		descuento = conversion(valor_pesos_pct, "p", m_salida);
		System.out.println("Ques es igual a : "+ descuento+ "  "+ map.get(m_salida));
		total = sub_total - descuento;
		System.out.println("Total: "+ total +" "+map.get(m_salida));
		
	}

}
