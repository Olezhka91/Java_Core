package ua.lviv.lgs.task2.interface2;

public class MyCalculator implements ua.lviv.lgs.task2.interface1.Numberable {

    double a;
    double b;

    public MyCalculator() {
    }

    public MyCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double plus() {
        return this.a + this.b;
    }

    @Override
    public double minus() {
        return this.a - this.b;
    }

    @Override
    public double multiply() {
        return this.a * this.b;
    }

    @Override
    public double devide() {
        return this.a / this.b;
    }

    static void viewCalcResult(double result) {
        System.out.println("Результат операції рівний " + result);
    }
}
