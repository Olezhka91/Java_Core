package ua.lviv.lgs.task1;

public class Main {
    public static void main(String[] args) {
        FixedSalaryWorker id245 = new FixedSalaryWorker("�����", 3546);
        HourlyWageWorker id32 = new HourlyWageWorker("����", 145,40.60);

        id245.salary();
        id32.salary();
    }

}
