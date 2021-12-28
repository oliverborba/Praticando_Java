package dollar;

public class Valor {

    public static double real;
    public static double dollar;

    public static double converge() {
        return dollar * real;
    }

    public static double percent() {
        return 6.0 / 100.0;
    }

    public static double totalDollar() {
        return converge() * percent();
    }

    public static double IOF() {
        return converge() + totalDollar();
    }

}
