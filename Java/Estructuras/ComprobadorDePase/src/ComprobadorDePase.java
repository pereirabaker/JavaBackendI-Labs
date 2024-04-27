import java.util.Scanner;

public class ComprobadorDePase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese calificacion: ");
        double calif = scan.nextDouble();
        if (calif < 0 || calif > 10 ) {
            System.out.println("La calificacion debe estar entre 0 y 10.");
        } else if (calif < 5) {
            System.out.println("Reprobado.");
        } else if (calif < 10) {
            System.out.println("Aprobado.");
        }
        scan.close();
    }
}
