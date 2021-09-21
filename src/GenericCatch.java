import java.util.Scanner;

public class GenericCatch {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*** Calcular la división de dos números ***");

        try {
            System.out.println("Ingresa el divisor (número entero): ");
            int divisor = sc.nextInt();
            System.out.println("Ingresa el dividendo (número entero): ");
            int dividendo = sc.nextInt();
            int resultado = divisor / dividendo;
            System.out.println("El resultado es: " + resultado);

        } catch (Exception ex) {
            System.out.println("Error en la ejecución.");
        } finally {
            System.out.println("Gracias por visitar @codigazosit");
        }
    }
}
