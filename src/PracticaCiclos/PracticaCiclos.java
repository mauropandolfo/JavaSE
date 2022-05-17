package PracticaCiclos;
import java.util.Scanner;

public class PracticaCiclos {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] numeros;
        Integer cantidad;

        /* Ingresar la cantidad y las notas */
        System.out.print("Ingrese la cantidad de notas: ");
        cantidad = in.nextInt();
        numeros = new Integer[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la nota: ");
            Integer nota = in.nextInt();
            numeros[i] = nota;
        }
        /* Mostrar promedio */
        promedio(numeros);
    }

    public static void promedio(Integer[] numeros) {
        float promedio;
        Integer count = 0;
        for (Integer numero : numeros) {
            count += numero;
        }
        promedio = count / numeros.length ;
        System.out.print("El promedio es: " + promedio);
    }
}
