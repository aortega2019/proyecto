/**
 * Clase Persona con los datos basicos de una persona
 * @author Adrian Basso Piqueras
 *
 */
public class Persona {

	private String nombre, apellidos;
	private int edad;
	
	
	/**
	 * Constructor por defecto
	 */
	public Persona() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	/**
	 * 
	 * @param nombre Nombre de la Persona
	 * @param apellidos Apellidos de la Persona
	 * @param edad Edad de la persona
	 */
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	/**
	 * 
	 * @return String nombre de la Persona
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre Establece el nombre de la Persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return String los apellidos de la Persona
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * 
	 * @param apellidos Establece los apellidos de la Persona
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * 
	 * @return int con la edad de la Persona
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * 
	 * @param edad Establece la edad de la persona
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
	
	
	
}
