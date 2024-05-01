import java.util.Scanner;

public class CalculadoraDeRangoDeEdad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese du edad: ");
        int edad = scan.nextInt();
        if (edad<0) {
            System.out.println("Ingrese una edad valida");
        } else if (edad <=12) {
            System.out.println("Niñez.");
        } else if (edad <=21) {
            System.out.println("Adolescencia.");
        } else if (edad <=30) {
            System.out.println("Juventud.");
        } else if (edad <=65) {
            System.out.println("Adultez.");
        } else {
            System.out.println("Ancianidad.");
        }
        scan.close();
    }
}
