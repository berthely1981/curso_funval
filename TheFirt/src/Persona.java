import java.util.Scanner;

public class Persona {

    private String nombre;
    private static int edad;

    public void setNombre(String nom) {                                                                           
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int ed) {
        edad = ed;
    }

    public int getEdad() {
        return edad;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		System.out.println("Ingresa tu nombre");
		p.setNombre(sc.nextLine());
		System.out.println("Ingresa tu edad");
		p.setEdad(sc.nextInt());
		sc.nextLine();
		System.out.println("Hola :" + p.getNombre());
		System.out.println("tienes : " + p.getEdad());
		
	}
}
