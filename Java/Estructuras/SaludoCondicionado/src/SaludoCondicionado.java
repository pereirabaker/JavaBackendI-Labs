import java.util.Scanner;

public class SaludoCondicionado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hora;
        do {
            System.out.println("Ingrese la hora (en formato 24hs): ");
            hora = scan.nextInt();
            if (hora < 0 || hora > 24) {
                System.out.println("La hora ingresada es incorrecta. Ingrese una hora valida.");
            }
        } while (hora < 0 || hora > 24);
        if (6 <= hora && hora <= 11) {
            System.out.println("Buenos dias.");
        } else if (11 <= hora && hora <= 19) {
            System.out.println("Buenas tardes.");
        } else {
            System.out.println("Buenas noches.");
        }
        scan.close();
    }
}
