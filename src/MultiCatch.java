import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

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

        } catch (ArithmeticException ex) {
            System.out.println("No es posible dividir sobre cero.");
        } catch (InputMismatchException ex) {
            System.out.println("Los valores ingresados deben ser números.");
        } finally {
            System.out.println("Gracias por visitar @codigazosit");
        }
    }
}
