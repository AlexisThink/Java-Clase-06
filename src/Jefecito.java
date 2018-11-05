import java.util.Scanner;

public class Jefecito {

	public static void main(String[] args) 
	{
		//Entrada por telcado
		Scanner teclado = new Scanner(System.in);
		
		
		//Llamando al Becario
		Becario venBecario = new Becario();
		
		
		//Mostrar el menu
		venBecario.diMenu();
		
		//Eleccion del Menu
		venBecario.eleccion=teclado.nextInt();
		
		//Dah
		venBecario.eleccionSwitch();
		
		//Usuarios que va a Registrar
		venBecario.eleccionJefecito=teclado.nextInt();
		//Usuarios
		venBecario.designacionPass=teclado.nextLine();
		//Pass
		venBecario.designacionPass=teclado.nextLine();
	}

}
