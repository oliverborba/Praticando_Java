package exercicio.application;

import exercicio.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter with the student's name: ");
        student.name = sc.nextLine();
        System.out.print("Type with the student's first grade: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Type with the student's second grade: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Type with the student's second grade: ");
        student.grade3 = sc.nextDouble();
        System.out.println("Average for application: 60");
        System.out.printf("Final Grade: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 70.0) {
            System.out.println("FAILED");
            System.out.printf("Missing: %.2f%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }

}
