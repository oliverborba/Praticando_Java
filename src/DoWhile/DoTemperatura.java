package DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class DoTemperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.println("Digite a temperatura em graus Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.println("Deseja repedir (s/n)");
            resp = sc.next().charAt(0);
        } while (resp != 'n'); //executa os comandos e só apos isso a condição.
        sc.close();
    }
}