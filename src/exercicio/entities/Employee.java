package exercicio.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;//Calculo salário liquido
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;//Calculo do adicional de comissão
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}

