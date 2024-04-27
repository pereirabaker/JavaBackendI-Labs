import java.util.Scanner;

public class VerificacionDeEdad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad = scan.nextInt();
        if (edad > 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}


