package com.curso_funval;
import java.util.Scanner;
import com.curso_funval.Circulo;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		do {
			System.out.println("Menu ::::");
			System.out.println("Para convertir de grados Centigrados a Kelvin presione ::: a");
			System.out.println("Para calcular el area de un rectangulo presione ::: b");
			System.out.println("Para calcular el area de un circulo presione ::: c");
			System.out.println("digite su respuesta");
			
			if(myObj.hasNextLine()) {
				String seleccion =myObj.nextLine();
				switch(seleccion) {
				case "a" :
					System.out.println("ingrese los grados Centigrados:: ");
					double a = myObj.nextFloat() + 273.15;
					myObj.nextLine();
					System.out.println("el resultado es " + a + " Kelvin");
					break;
					
				case "b" : 
					System.out.println("ingrese el valor del primer lado a :: ");
					float la = myObj.nextFloat();
					myObj.nextLine();
					System.out.println("ingrese el valor del primer lado b :: ");
					float lb = myObj.nextFloat();
					myObj.nextLine();
					System.out.println("el resultado es " + la * lb );
					break;
				case "c" :
					System.out.println("ingrese el valor del radio del circulo :: ");
					float r = myObj.nextFloat();
					myObj.nextLine();
					Circulo c = new Circulo();
					System.out.println("el resultado es " + c.calculaArea(r) );
					break;
				default : 
					System.out.println("opción incorrecta");
					System.out.println();
					System.out.println();
				}
				
			}
		}while(true);
	}

}
