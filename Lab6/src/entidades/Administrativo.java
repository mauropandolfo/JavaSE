package entidades;

import java.util.Date;

public class Administrativo extends Empleado{

	public Administrativo() {
		super();
	}
	
	public Administrativo(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo,
			Double sueldo) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Administrativo [toString()= " + super.toString() + "]";
	}

	@Override
	public String mostrarTipoPersona() {
		return getNombre() + "" + getApellido() + " es Administrativo";
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println("Administrativo guardado");
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		System.out.println("Administrativo eliminado");
		
	}

	@Override
	public void modificar() {
		// TODO Auto-generated method stub
		System.out.println("Administrativo modificado");
		
	}
	
}
