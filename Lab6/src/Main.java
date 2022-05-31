import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import comparadores.CompDoc;
import entidades.Administrativo;
import entidades.Alumno;
import entidades.Director;
import entidades.Documento;
import entidades.Persona;
import entidades.Profesor;
import enums.TipoDoc;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;



public class Main {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Set<Persona> personas = new HashSet<>();
		List<Persona> listaPersonas = new ArrayList<>();

		System.out.println("Ingreso de datos");

		System.out.print("Ingrese la cantidad de Personas que cargara: ");
		int cantidadPersonas = teclado.nextInt();

		for (int i = 0; i < cantidadPersonas; i++) {

			String nombre;
			String apellido;
			TipoDoc tipo;
			Integer numero;
			Date fechaNacimiento;
			Date fechaCargo;
			int cantidadCursos;
			String carrera;
			Double sueldo;

			System.out.println("Ingreso tipo de Persona:");
			System.out.println("1 - Alumno.");
			System.out.println("2 - Director.");
			System.out.println("3 - Profesor.");
			System.out.println("4 - Administrativo.");
			System.out.println();
			int tipoPersona = teclado.nextInt();
			Persona persona = null;

			System.out.print("Ingrese el Nombre de la Persona [" + (i + 1) + "]: ");
			nombre = teclado.next();
			System.out.print("Ingrese el Apellido de la Persona [" + (i + 1) + "]: ");
			apellido = teclado.next();

			while (true) {
				System.out.print("Ingrese el Tipo de Documento de la Persona [" + (i + 1) + "]: ");

				try {
					tipo = TipoDoc.valueOf(teclado.next().toUpperCase());
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
			System.out.print("Ingrese el Numero de Documento de la Persona [" + (i + 1) + "]: ");
			numero = teclado.nextInt();
			System.out.println("Ingrese la Fecha de Nacimiento de la Persona [" + (i + 1) + "]: ");
			fechaNacimiento = obtenerFecha();

			switch (tipoPersona) {
			case 1:

				System.out.print("Ingrese la cantidad de cursos de la Persona [" + (i + 1) + "]: ");
				cantidadCursos = teclado.nextInt();

				persona = new Alumno(nombre, apellido, new Documento(tipo, numero), fechaNacimiento,
						agregarCursos(cantidadCursos));

				break;
			case 2:
				System.out.println("Ingrese la Fecha de inicio del Cargo de la Persona [" + (i + 1) + "]: ");
				fechaCargo = obtenerFecha();

				System.out.println("Ingrese la Carrera encargada de la Persona [" + (i + 1) + "]: ");
				carrera = teclado.next();

				System.out.print("Ingrese el Sueldo de la Persona [" + (i + 1) + "]: ");
				sueldo = teclado.nextDouble();

				persona = new Director(nombre, apellido, new Documento(tipo, numero), fechaNacimiento, fechaCargo,
						sueldo, carrera);
				break;

			case 3:
				System.out.println("Ingrese la Fecha de inicio del Cargo de la Persona [" + (i + 1) + "]: ");
				fechaCargo = obtenerFecha();

				System.out.print("Ingrese el Sueldo de la Persona [" + (i + 1) + "]: ");
				sueldo = teclado.nextDouble();

				System.out.print("Ingrese la cantidad de cursos de la Persona [" + (i + 1) + "]: ");
				cantidadCursos = teclado.nextInt();

				persona = new Profesor(nombre, apellido, new Documento(tipo, numero), fechaNacimiento, fechaCargo,
						sueldo, agregarCursos(cantidadCursos));
				break;

			case 4:
				System.out.println("Ingrese la Fecha de inicio del Cargo de la Persona [" + (i + 1) + "]: ");
				fechaCargo = obtenerFecha();

				System.out.print("Ingrese el Sueldo de la Persona [" + (i + 1) + "]: ");
				sueldo = teclado.nextDouble();

				persona = new Administrativo(nombre, apellido, new Documento(tipo, numero), fechaNacimiento, fechaCargo,
						sueldo);
				break;
			}

			personas.add(persona);

		}

		System.out.println("Personas:");
		for (Persona persona : personas) {
			System.out.println(persona);
			System.out.println(persona.mostrarTipoPersona());
		}

		listaPersonas.addAll(personas);
		listaPersonas.sort(new CompDoc());

		System.out.println();
		System.out.println("Personas Ordenadas:");
		for (Persona persona : listaPersonas) {
			System.out.println(persona);
		}

		teclado.close();
	}

	private static Date obtenerFecha() {
		int anio = 0;
		int mes = 0;
		int dia = 0;
		while (true) {
			try {
				System.out.print("Ingrese el año: ");
				anio = teclado.nextInt();
				break;
			} catch (Exception e) {
				System.err.println("debe ingresar un dato valido: " + e.getMessage());
			}
		}

		while (true) {
			try {
				System.out.print("Ingrese el mes en numero, ej: 1 que indica enero, 12 que indica diciembre: ");
				mes = teclado.nextInt();
				if (mes < 1 || mes > 12) {
					throw new Exception("los meses deben estar comprendidos entre 1 y 12");
				}
				break;
			} catch (Exception e) {
				System.err.println("debe ingresar un dato valido: " + e.getMessage());
			}
		}

		while (true) {
			try {
				System.out.print("Ingrese el dia: ");
				dia = teclado.nextInt();
				if (dia < 1) {
					throw new Exception("los dias deben ser un numero positivo");
				} else {
					if (mes == 2) {
						if (dia > 28) {
							throw new Exception("el mes 2 posee un maximo de 28 dias");
						}
					} else if ((dia > 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
						throw new Exception("los dias para estos meses debe estar comprendidos entre 1 y 30");
					} else if ((dia > 31)) {
						throw new Exception("los dias para estos meses debe estar comprendidos entre 1 y 31");
					}
				}

				break;
			} catch (Exception e) {
				System.err.println("debe ingresar un dato valido: " + e.getMessage());
			}
		}

		return new Date(anio - 1900, mes - 1, dia);
	}

	private static String[] agregarCursos(int cantidad) {
		String[] cursos = new String[cantidad];

		for (int i = 0; i < cursos.length; i++) {
			System.out.print("Ingrese el curso [" + (i + 1) + "] : ");
			cursos[i] = teclado.next();
		}
		return cursos;

	}

}
