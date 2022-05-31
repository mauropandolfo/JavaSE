package entidades;

import java.util.Date;

public class Profesor extends Empleado {
	private String[] cursos;
	
	public Profesor() {
		super();
	}
	
	public Profesor(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo,
			Double sueldo, String[] cursos) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.cursos = cursos;
	}

	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public String mostrarTipoPersona() {
		return getNombre() + "" + getApellido() + " es Profesor";
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println("Profesor guardado");
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		System.out.println("Profesor eliminado");
		
	}

	@Override
	public void modificar() {
		// TODO Auto-generated method stub
		System.out.println("Profesor modificado");
		
	}
	
}
