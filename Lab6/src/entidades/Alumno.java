package entidades;

import java.util.Date;

public class Alumno extends Persona{
	private String[] cursos;

	public Alumno() {
		super();
	}

	public Alumno(String nombre, String apellido, Documento documento, Date fechaNacimiento,String[] cursos) {
		super(nombre, apellido, documento, fechaNacimiento);
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
		return getNombre() + "" + getApellido() + " es Alumno";
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		System.out.println("Alumno guardado");
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		System.out.println("Alumno eliminado");
		
	}

	@Override
	public void modificar() {
		// TODO Auto-generated method stub
		System.out.println("Alumno modificado");
		
	}
	
	
}
