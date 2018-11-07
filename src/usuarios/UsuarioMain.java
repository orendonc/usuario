package usuarios;

import java.util.Scanner;

public class UsuarioMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Por favor ingrese el usuario: ");
		String usuario=sc.nextLine();
		
		System.out.println("Por favor ingrese la contraseña: ");
		String contrasena=sc.nextLine();
		
		System.out.println("Por favor ingrese el nombre: ");
		String nombre=sc.nextLine();
		
		System.out.println("Por favor ingrese la edad:");
		//int edad= Integer.parseInt(sc.nextLine());
		int edad=validarEdad();
		System.out.println("\nEl usuario:" + usuario + " \ncontraseña: " + contrasena + " \nnombre: "+ nombre +" \nedad: " + edad );
		System.out.println(String.format("El usuario: %s \ncontrasena: %s \nnombre: %s \nedad: %s", usuario,contrasena,nombre,edad));
	}
	
	public static int validarEdad() {
		try {
			int edad= Integer.parseInt(sc.nextLine());
//			if (edad>0) {
//				return edad;
//			}else {
//				System.out.println("Ingresaste un valor negativo, por lo que se seteo la edad a 0");
//				return 0;
//			}
			
			while(edad<0) {
				System.out.println("La eddad no puede ser negativa, vueleve a ingresar la edad");
				edad= Integer.parseInt(sc.nextLine());
			}
		}catch(java.lang.NumberFormatException e){
			System.out.println("E valos que ingreso no es númerico o esta vacío");

		}catch(Exception e) {
			System.out.println("Ocurrio un error");
			
		}
		System.exit(0);
		return 0;
	}

}
