import java.util.Scanner;

/*Codificar un programa interactivo que muestre de forma
obligatoria en consola una lista con las siguientes opciones de cálculo: 1. Calcular área de un triángulo,
2. Calcular perímetro de un cuadrado, 3. Calcular volumen de un cubo, y 4. Finalizar el programa.
El bucle se ejecutará indefinidamente refrescando el menú en pantalla hasta que el usuario digite el
dígito exacto de salida (4).*/

public class ControladorDeTransacciones {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Calcular área de un triángulo\n" +
            "2. Calcular perímetro de un cuadrado\n" + "3. Calcular volumen de un cubo\n" + "4. Finalizar el programa.");
            System.out.print("Digite una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion){

                case 1: 
                    System.out.print("Ingrese la base del triangulo: ");
                    int base = entrada.nextInt();
                    System.out.print("Ingrese la altura del triangulo: ");
                    int altura = entrada.nextInt();
                    int area = (base*altura)/2;
                    System.out.println("El area del triangulo es: " +area);
                    break;
                case 2:
                    System.out.print("Ingrese la medida de uno de los lados del cuadrado: ");
                    int medidaLado = entrada.nextInt();
                    int perimetro = medidaLado*4;
                    System.out.println("El perimetro del cuadrado es: " +perimetro);
                    break;
                case 3:
                    System.out.print("Ingrese la medida de un lado del cubo: ");
                    int lado = entrada.nextInt();
                    int volumen = lado*lado*lado;
                    System.out.println("El volumen del cubo es: " +volumen);
                    break;
                case 4:
                    System.out.println("Programa finalizado");
                    break;
                default:{
                    System.out.println("Ingrese una de las opciones ");
                }

            }
        }while(opcion != 4);

        entrada.close();
    }
}