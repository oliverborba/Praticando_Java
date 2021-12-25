package For;

import java.util.Scanner;

public class ForDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//Definir o valor para consultas

        for (int i = 0; i < n; i++) { //Laço for utilizado para definir o número de vezes para consulta
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y == 0) {
                System.out.println("Divisão impossível");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}
