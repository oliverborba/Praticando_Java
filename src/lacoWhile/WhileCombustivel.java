package lacoWhile;

import java.util.Scanner;

public class WhileCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Comando para entrada de dados

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0; //Variais iniciando em 0(zero) seus valores serão atribuidos e somados a elas mesmas no decorrer do codigo (+=)

        int tipo = sc.nextInt(); //Atribuindo comando de entrada a variavel tipo

        while (tipo != 4) { // Mantendo com sinal diferente de "4" ele mantem a repetição
            if (tipo == 1) {
                alcool = alcool + 1; //o numero 1 no if atrubui este "indice" ao alcool
            } else if (tipo == 2) {
                gasolina = gasolina + 1; //o numero 2 no if atrubui este "indice" a gasolina
            } else if (tipo == 3) {
                diesel = diesel + 1;
            }
            tipo = sc.nextInt(); // Atribuir a entrada ao final do while ou o codigo ficará em looping
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool " + alcool);
        System.out.println("Gasolina " + gasolina);
        System.out.println("Diesel " + diesel);

        sc.close();

    }
}
/* Ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Imprimir a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo*/