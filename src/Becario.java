
public class Becario {

	int i;
	int eleccion;
	int eleccionJefecito;
	int usuariosRegistrar;
	String usuarios[] = null;
	String passwords[] = null;
	String designacionUser;
	String designacionPass;

	public void diMenu() {

		System.out.println("1) REGISTRAR USUARIOS");
		System.out.println("2) ACTUALIZAR USUARIOS");
		System.out.println("3) LOGIN");
		System.out.println("4) VER USUARIOS");
		System.out.println("5) SALIR");
	}

	public void eleccionSwitch() {
		
		switch (eleccion){
		
		case 1:
		//Opcion elegida	
		System.out.println("..::REGISTRO DE USUARIOS::..");
		
		//Usuarios a Registrar
		System.out.println("Cuantos usuarios desea registra");
			
		usuariosRegistrar=eleccionJefecito;
		 usuarios= new String[usuariosRegistrar];
		 passwords= new String[usuariosRegistrar];
		
		for(i=0; i<usuariosRegistrar; i++){
			System.out.println("Introduzca el nombre del usuario");
			usuarios[i]= designacionUser;
			System.out.println("Introduzca la contraseña del usuario");
			passwords[i]= designacionPass;
		}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		
	
	
		}
	}

}