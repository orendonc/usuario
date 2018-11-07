package usuarios;

public class UsuarioObjectMain {

	public static void main(String[] args) {
		Usuario usuario1=Usuario.init();
		Usuario usuario2=Usuario.init("roscar","4321");
		Usuario usuario3=Usuario.init("orendon","123","Oscar");
		Usuario usuario4=Usuario.init("croscar","5678","eduardo",12);
		
		//Usuario.example();
		
		System.out.println(usuario1 + "\n");
		System.out.println(usuario2 + "\n");
		System.out.println(usuario3 + "\n");
		System.out.println(usuario4 + "\n");
	}

}
