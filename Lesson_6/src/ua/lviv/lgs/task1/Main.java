package ua.lviv.lgs.task1;

public class Main {
    public static void main(String[] args) {
        FixedSalaryWorker id245 = new FixedSalaryWorker("Роман", 3546);
        HourlyWageWorker id32 = new HourlyWageWorker("Ігор", 145,40.60);

        id245.salary();
        id32.salary();
    }

}
