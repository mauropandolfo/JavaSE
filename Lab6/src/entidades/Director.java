package entidades;

import java.util.Date;

public class Director extends Empleado{
	private String carrera;

	public Director() {
		super();
	}

	public Director(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo,
			Double sueldo, String carrera) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String mostrarTipoPersona() {
		return getNombre() + "" + getApellido() + " es Director";
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println("Director guardado");
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		System.out.println("Director eliminado");
		
	}

	@Override
	public void modificar() {
		// TODO Auto-generated method stub
		System.out.println("Director modificado");
		
	}
	
	
	
	
}
