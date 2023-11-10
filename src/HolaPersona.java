import java.util.Scanner;

public class HolaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		
		String nombre = s.next();

		System.out.println("Bienvenido " + nombre);
		
		s.close();
	}

}
