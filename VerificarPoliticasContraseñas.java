import java.util.Scanner;

/*Implementar una rutina que solicite la
creación de un nuevo PIN o clave de seguridad informática a un usuario mediante consola. Por
políticas internas del servidor corporativo, la clave de acceso debe contar obligatoriamente con una
longitud de texto igual o mayor a 8 caracteres de longitud. El programa debe insistir en la captura de
datos si el usuario no cumple la restricción de caracteres.*/

public class VerificarPoliticasContraseñas{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String claveSeguridad = "";
        int minCaracteres = 8;

        do {
            System.out.print("Cree su nueva clave de seguridad: ");
            claveSeguridad = entrada.nextLine();
            if (claveSeguridad.length() < minCaracteres){
                System.out.println("La clave de seguridad debe de tener minimo 8 caracteres");
            }
        }while (claveSeguridad.length() < minCaracteres);

        entrada.close();
    }
}