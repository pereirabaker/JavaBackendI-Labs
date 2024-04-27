import java.util.Scanner;

public class ClasificadorDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scan.nextInt();
        if (num < 0) {
            System.out.println("El numero es negativo");
        } else if (num == 0) {
            System.out.println("El numero es 0");
        } else {
            System.out.println("El numero es positivo");
        }
        scan.close();
    }
}