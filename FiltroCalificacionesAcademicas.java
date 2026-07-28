import java.util.Scanner;

/*Escribir un módulo informático encargado de capturar a
través de ventanas gráficas de diálogo la nota final para un módulo del trimestre de un estudiante. El
software debe exigir obligatoriamente el ingreso de la calificación y persistir repitiendo la ventana
flotante de error y captura mientras el valor decimal introducido no esté dentro de las fronteras del
rango académico legal colombiano (0.0 ≤ nota ≤ 5.0).*/

public class FiltroCalificacionesAcademicas {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double notaFinal = 0;

        do {
            System.out.print("Ingrese la nota final: ");
            notaFinal = entrada.nextDouble();
            if (notaFinal < 0 || notaFinal > 5){
                System.out.println("Error. Nota invalida");
            }
        } while (notaFinal < 0 || notaFinal > 5);

        entrada.close();
    }
}