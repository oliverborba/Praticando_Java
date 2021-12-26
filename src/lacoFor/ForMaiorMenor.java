package lacoFor;

import java.util.Scanner;

public class ForMaiorMenor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int in = 0;// Variável para entrada de dados
        int out = 0;//Variável para saída de dados

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) { //para se manter na entrada o intervalo entre os numeros devem estar entre 10 e 20
                in = in + 1;
            } else {
                out = out + 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}

/*Ler um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/