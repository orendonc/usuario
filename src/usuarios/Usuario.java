package usuarios;

public class Usuario {
	private String usuario;
	private String contrasena;
	private String nombre;
	private int edad;
	
	public Usuario() {
		usuario="elbenavi";
		contrasena="123";
		nombre="eduardo";
		edad=18;
	}
	public Usuario(String usuario, String contrasena) {
		this.usuario=usuario;
		this.contrasena=contrasena;
		nombre="Maria";
		edad=18;
	}
	
	
	
	public Usuario(String usuario, String contrasena, String nombre) {
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.nombre = nombre;
		
	}
	
	
	public Usuario(String usuario, String contrasena, String nombre, int edad) {

		this.usuario = usuario;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String toString(){
		return "usuario: "+usuario+" password: "+contrasena+" nombre: "+nombre+" edad: "+edad;
	}
	
	public static Usuario init() {
		return new Usuario();
		
	}
	
	public static Usuario init(String usuario, String contrasena) {
		return new Usuario(usuario,contrasena);
	}
	
	public static Usuario init(String usuario, String contrasena, String nombre) {
		return new Usuario(usuario,contrasena,nombre);
	}
	
	public static Usuario init(String usuario, String contrasena, String nombre, int edad) {
		return new Usuario(usuario,contrasena,nombre,edad);
	}
}
