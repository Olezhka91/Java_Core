package ua.lviv.lgs.task1;

public class HourlyWageWorker extends Worker implements Salary {
    private int monthWorkedHours;
    private double hourRate;

    public HourlyWageWorker(String name, int monthWorkedHours, double hourRate) {
        super(name);
        this.monthWorkedHours = monthWorkedHours;
        this.hourRate = hourRate;
    }


    @Override
    public void salary() {
        double salary = this.monthWorkedHours * this.hourRate;
        System.out.println("Зарплата " + super.getName() + " становить " +salary+ "грн");

    }
}
