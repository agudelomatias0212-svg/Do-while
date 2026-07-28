import java.util.Scanner;

/*Suma acumulada con centinela Solicita números enteros al usuario y ve acumulándolos. 
El proceso termina cuando el usuario ingrese 0. Al finalizar muestra: la suma total, 
la cantidad de números ingresados (sin contar el 0) y el promedio.*/

public class SumaAcumulada {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int numero = 0;
        int suma = 0;
        int contador = 0;
        double = promedio;

        do {
            System.out.println("Ingrese un numero (0 para terminar)");
            numero = sc.nextInt();

            if (numero != 0){
                suma += numero;
                System.out.println ("Suma total");
            } else {
                System.out.println ("Proceso finalizado");
            }
          
        } while (numero != 0);

        System.out.println("Suma total: " + suma);
        System.out.println("Cantidad de números: " + contador);

        if (contador > 0) {
            promedio = (suma / contador);
            System.out.println ("Promedio: " +promedio);
        } 
    }
}