package For;

import java.util.Scanner;

public class ForImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
Ao solicitar o % (resto 2 != 0 se importam todos os numeros que não são divisiveis por 2, logo todos são numeros impares)
 */
