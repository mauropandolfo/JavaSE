package entidades;

import java.util.Date;

public abstract class Empleado extends Persona{
	private Date fechaCargo;
	private Double sueldo;
	
	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo, Double sueldo) {
		super(nombre, apellido, documento, fechaNacimiento);
		this.fechaCargo = fechaCargo;
		this.sueldo = sueldo;
	}

	public Date getFechaCargo() {
		return fechaCargo;
	}

	public void setFechaCargo(Date fechaCargo) {
		this.fechaCargo = fechaCargo;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [fechaCargo=" + fechaCargo + ", sueldo=" + sueldo + "]";
	}

}
