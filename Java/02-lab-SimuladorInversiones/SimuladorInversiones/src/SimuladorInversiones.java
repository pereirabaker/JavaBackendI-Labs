import java.util.Scanner;
import java.util.Locale;

public class SimuladorInversiones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(new Locale("es", "ES"));

        System.out.println("Ingrese el estado del mercado (recesión, estable, crecimiento): ");
        String estado = scan.nextLine();

        System.out.println("Ingrese su perfil de riesgo (bajo, medio, alto): ");
        String perfil = scan.nextLine();

        switch (estado.toLowerCase()) {
            case "recesión":
                if (perfil.equalsIgnoreCase("bajo")) {
                    System.out.println("Inversión recomendada: Bonos.");
                } else if (perfil.equalsIgnoreCase("medio")) {
                    System.out.println("Inversión recomendada: Bienes raíces.");
                } else if (perfil.equalsIgnoreCase("alto")) {
                    System.out.println("Inversión recomendada: Acciones de empresas sólidas.");
                }
                break;
            case "estable":
                if (perfil.equalsIgnoreCase("bajo")) {
                    System.out.println("Inversión recomendada: Cuentas de ahorro.");
                } else if (perfil.equalsIgnoreCase("medio")) {
                    System.out.println("Inversión recomendada: Bienes raíces.");
                } else if (perfil.equalsIgnoreCase("alto")) {
                    System.out.println("Inversión recomendada: Acciones de empresas con potencial de crecimiento.");
                }
                break;
            case "crecimiento":
                if (perfil.equalsIgnoreCase("bajo")) {
                    System.out.println("Inversión recomendada: Bonos gubernamentales.");
                } else if (perfil.equalsIgnoreCase("medio")) {
                    System.out.println("Inversión recomendada: Acciones diversificadas.");
                } else if (perfil.equalsIgnoreCase("alto")) {
                    System.out.println("Inversión recomendada: Acciones de empresas de tecnología.");
                }
                break;
            default:
                System.out.println("Opción ingresada inválida.");
                break;
        }
    }
}