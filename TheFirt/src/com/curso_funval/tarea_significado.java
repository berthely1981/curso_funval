package com.curso_funval;
import java.lang.Math;

public class tarea_significado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 16 + (32/4)
        float a = 16 * (32/4);
		
		//(48 - 7)%11
		float b = (48 - 7) % 11;
		
		//(18 + 2) / (17 - 12)
		float c = (18 + 2) / (17 - 12);
		
		// 17 - 18 / 6 * 3 + 11 % 4
		float d = 17 - ((18/6)*3) + (11 %  4);
		
		System.out.println("a ::: "+a);
		System.out.println("b ::: "+b);
		System.out.println("c ::: "+c);
		System.out.println("d ::: "+d);
	}

}
