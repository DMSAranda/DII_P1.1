package dam2.dii.p11;
															//usuario con sus metodos y atributos
public class Usuario {

	private String nombre;
	private String pass1;
	private String pass2;
	
	public Usuario(String nombre, String pass1, String pass2) {
		
		super();
		
		this.nombre = nombre;
		this.pass1 = pass1;
		this.pass2 = pass2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass1() {
		return pass1;
	}

	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}

	public String getPass2() {
		return pass2;
	}

	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	
	
	
	
}
