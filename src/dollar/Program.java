package dollar;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        Valor.real = sc.nextDouble();
        System.out.print("How many dollars will be bought ? ");
        Valor.dollar = sc.nextDouble();
        System.out.printf("Amount to be paid in reais: %.2f%n", Valor.IOF());
    }
}
//Primeiro projeto que consegui realizar sozinho, sem consultas, o código não está limpo, porem este está funcional