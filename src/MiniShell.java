import java.util.Scanner;

public class MiniShell {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Primer programa: ");
        String programa1 = teclado.nextLine();

        System.out.print("Segundo programa: ");
        String programa2 = teclado.nextLine();

        ProcessBuilder pb1 = new ProcessBuilder(programa1);
        ProcessBuilder pb2 = new ProcessBuilder(programa2);
    }
}