package funcao;

import java.util.Scanner;

public class FuncaoHigher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);//Dados serão importados da função
        shoeResult(higher);//Mensagem será importada de função específica

        sc.close();
    }

    public static int max(int x, int y, int z) {//função que receberá a lógica
        int aux;//Variável será utilizada para auxílio apenas dentro do escopo desta função
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void shoeResult(int value) {
        System.out.println("Higher = " + value);
    }
}
/*Exemplo de funções para informar o maior número entre os indicados na entrada de valores*/