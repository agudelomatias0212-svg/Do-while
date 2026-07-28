import java.util.Scanner;

/*Pide al usuario que ingrese su edad. Si el valor no está entre 1 y 120, 
vuelve a pedirlo mostrando un mensaje de error. 
Cuando el dato sea válido, imprime "Edad registrada: X".*/

public class ValidacionEdad {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int edad;

        do {
            System.out.println("Ingrese su edad");
            edad = sc.nextInt();

            if (edad >= 1 && edad <= 120){
                System.out.println ("Edad registrada: " +edad);
                break;
            } else {
                System.out.println ("Error, rango de edad: 1 - 120");
            }

        } while (!(edad > 1 && edad < 120));

    }
}