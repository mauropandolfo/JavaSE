package Objetos;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String tipoDoc;
	private int documento;
	private int edad;
	
	//constructores
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String apellido, String tipoDoc, int documento, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDoc = tipoDoc;
		this.documento = documento;
		this.edad = edad;
	}
	//getters and seters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", tipoDoc=" + tipoDoc + ", documento="
				+ documento + ", edad=" + edad + "] y es " + (edad >= 18 ? "mayor de edad" : "menor de edad");
	}
	
	
}
