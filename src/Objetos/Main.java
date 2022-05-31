package Objetos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Persona[] personas;
		int cantPersonas;
		
		System.out.println("****Ingreso de datos****");
		System.out.println("Ingrese la cantidad de personas que quiere cargar: ");
		
		cantPersonas = input.nextInt();
		
		personas = new Persona[cantPersonas];
		
		for(int i = 0 ; i < personas.length; i++) {
			Persona aux = new Persona();
			System.out.println("Ingrese el nombre de la persona [" + ( i + 1 ) + "]");
			String nombre = input.next();
			aux.setNombre(nombre);
			System.out.println("Ingrese el apellido de la persona [" + ( i + 1 ) + "]");
			String apellido = input.next();
			aux.setApellido(apellido);
			System.out.println("Ingrese el tipo de DNI de la persona [" + ( i + 1 ) + "]");
			String tipoDoc = input.next();
			aux.setTipoDoc(tipoDoc);
			
			System.out.println("Ingrese el numero de documento de la persona [" + ( i + 1 ) + "]");
			try {
				int documento = input.nextInt();
				if(documento < 0 ) {
					throw new Exceptiones(2);
				}
				aux.setDocumento(documento);
				
			}
			catch(RuntimeException e){
				System.out.println("Se ingreso algo que no es un numero " + e.getMessage());
			} catch (Exceptiones e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			System.out.println("Ingrese la edad de la persona [" + ( i + 1 ) + "]");
			String edad = input.next();
			aux.setApellido(edad);
		
			personas[i] = aux;
			
		}
		
		
		System.out.println("****Datos de las personas****");
		for(int i = 0; i < personas.length; i++) {
			System.out.println(personas[i].toString());
		}
		input.close();

	}

}
