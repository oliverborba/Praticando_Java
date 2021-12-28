package exercicio.application;

import exercicio.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

//Entrada dos dados referente ao trabalhador, salário e impostos
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary ? ");
        double percentage = sc.nextDouble();//informa o adicional de comissão
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated date: " + emp);
        sc.close();
    }
}
