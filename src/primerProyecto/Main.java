package primerProyecto;

import java.util.Scanner;

public class Main {
static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1;
		float n2;
		float n3;
		float res;
		String operacion;
		//vamos a hacer la suma
		
		System.out.print("Ingrese el numero 1: ");
		n1 = entrada.nextFloat();
		System.out.print("Ingrese el numero 2: ");
		n2 = entrada.nextFloat();
		System.out.print("Ingrese el numero 3: ");
		n3 = entrada.nextFloat();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1 + " es el mayor");
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println( n2 + " es el mayor");
		}
		else {
			System.out.println( n3 + " es el mayor");
		}
		
		System.out.print("Ingrese una operacion: s para sumar, r para restar, m para multiplicar o d para dividir: ");
		operacion = entrada.next();
		boolean repreguntar = true;
		
		while(repreguntar) {
			switch( operacion ) {
				case "s":
					res = n1+n2;
					System.out.println("El resultado de la suma es : "+ res );
					System.out.println("Desea hacer otra operacion?? y/n");
					String nextOperacion = entrada.next();
					if(nextOperacion == "y") {
						System.out.print("Ingrese una operacion: s para sumar, r para restar, m para multiplicar o d para dividir: ");
						operacion = entrada.next();
						repreguntar = true;
					}
					else if(nextOperacion == "n"){
						System.out.println("saliendoooo");
						repreguntar = false;
					}
					else {
						System.out.println("Opcion invalida");
						System.out.println("Desea hacer otra operacion?? y/n");
						operacion = entrada.next();
					}
					break;
				case "r":
					res = n1-n2;
					System.out.println("El resultados de la resta es: "+ res );
					System.out.println("Desea hacer otra operacion?? y/n");
					nextOperacion = entrada.next();
					if(nextOperacion == "y") {
						System.out.print("Ingrese una operacion: s para sumar, r para restar, m para multiplicar o d para dividir: ");
						nextOperacion = entrada.next();
						repreguntar = true;
					}
					else if(nextOperacion == "n"){
						System.out.println("saliendoooo");
						repreguntar = false;
					}
					else {
						System.out.println("Opcion invalida");
						System.out.println("Desea hacer otra operacion?? y/n");
						operacion = entrada.next();
					}
					break;
				case "m":
					res = n1 * n2;
					System.out.println("El resultado de la multiplicacion es : "+ res );
					System.out.println("Desea hacer otra operacion?? y/n");
					nextOperacion = entrada.next();
					if(nextOperacion == "y") {
						System.out.print("Ingrese una operacion: s para sumar, r para restar, m para multiplicar o d para dividir: ");
						operacion = entrada.next();
						repreguntar = true;
					}
					else if(operacion == "n"){
						System.out.println("saliendoooo");
						repreguntar = false;
					}
					else {
						System.out.println("Opcion invalida");
						System.out.println("Desea hacer otra operacion?? y/n");
						operacion = entrada.next();
					}
					break;
				case "d":
					res = n1+n2;
					System.out.println("El resultado de la division es : "+ res );
					System.out.println("Desea hacer otra operacion?? y/n");
					nextOperacion = entrada.next();
					if(nextOperacion == "y") {
						System.out.print("Ingrese una operacion: s para sumar, r para restar, m para multiplicar o d para dividir: ");
						nextOperacion = entrada.next();
						repreguntar = true;
					}
					else if(nextOperacion == "n"){
						System.out.println("saliendoooo");
						repreguntar = false;
					}
					else {
						System.out.println("Opcion invalida");
						System.out.println("Desea hacer otra operacion?? y/n");
						operacion = entrada.next();
					}
					break;
					default:
						System.out.println("Respuesta invalida");
						System.out.print("Ingrese una operacion: s para sumar, r para restar, m para multiplicar o d para dividir: ");
						operacion = entrada.next();
						repreguntar = true;
			}	
		}
			
		
		
		res = n1-n2;
		System.out.println("El resultados es resta: "+ res );
		res = n1*n2;
		System.out.println("El resultados de la multiplicacion es: "+ res );
		res= n1/n2;
		System.out.println("El resultados de la division es: "+ res );
		res=n1%n2;
		System.out.println("El residuo es de: "+ res );
		
		promedio(n1,n2);
		
	}	
	public static void promedio(float aux1, float aux2) {
		
		float numero1;
		float numero2;
		float promedio;
		
		System.out.print("Ingrese el primer numero: ");
		numero1 = entrada.nextFloat();
		System.out.print("Ingrese el segundo numero: ");
		numero2 = entrada.nextFloat();
		
		promedio = (numero1+numero2+aux1+aux2) /4;
		System.out.print("El promedio es: " + promedio);
		
	}

}

