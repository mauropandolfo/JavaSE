package entidades;

import java.util.Date;
import java.util.Objects;

import interfaces.Persistencia;

public abstract class Persona implements Persistencia{
	private String nombre;
	private String apellido;
	private Documento documento;
	private Date fechaNacimiento;
	
	public Persona() {
		super();
	}
	public Persona(String nombre, String apellido, Documento documento, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}
	public abstract String mostrarTipoPersona();
	
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
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, documento, fechaNacimiento, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(documento, other.documento)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(nombre, other.nombre);
	}
	
}
