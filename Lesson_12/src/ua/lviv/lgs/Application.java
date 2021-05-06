package ua.lviv.lgs;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        System.out.println("Enter the name of month from keyboard =  ");
        Scanner scan = new Scanner(System.in);
        String newMonthFromKeyboard = scan.next();
        Month month = Month.valueOf(newMonthFromKeyboard.toUpperCase());

        List<Month> list = new ArrayList<Month>();

        list.add(0, Month.JANUARY);
        list.add(1, Month.FEBRUARY);
        list.add(2, Month.MARCH);
        list.add(3, Month.APRIL);
        list.add(4, Month.MAY);
        list.add(5, Month.JUNE);
        list.add(6, Month.JULY);
        list.add(7, Month.AUGUST);
        list.add(8, Month.SEPTEMBER);
        list.add(9, Month.OCTOBER);
        list.add(10, Month.NOVEMBER);
        list.add(11, Month.DECEMBER);

        if (list.contains(month)) {
            System.out.println("The name of entered month is : " + month.name());
        } else {
            System.out.println("No such month");
        }

        // Виводимо кількість днів для місяця введеного з консолі
        System.out.println("There " + " " + month.days + " days in " + month.name());


        // Виводимо місяці які мають таку ж кількість днів
        for (Month b : list) {
            if (b.days == month.days) {
                System.out.println("Month with the same number of days : " + b.name());
            }
        }


        // Виводимо місяці з меншою кількістю  днів
        for (Month c : list) {
            if (c.days < month.days) {
                System.out.println("Month with the less quantity of days: " + c.name());
            }
        }
        //Місяці з більшою кількістю днів
        for (Month d : list) {
            if (month.days < d.days) {
                System.out.println("Month with the higher quantity of days: " + d.name().toString());
            }
        }
        //Наступна пора року
        for (Month e : list) {
            if (e.season.ordinal() == month.season.ordinal() + 1) {

                System.out.println("Next season " + e.getSeason());
            }
        }
        //Попередня пMора року
        for (Month f : list) {
            if (month.season.ordinal() - 1 == f.season.ordinal()) {

                System.out.println("Previous season " + f.getSeason());
            }
        }
        //Місяці з парною кількістю днів
        for (Month g : list) {
            if (g.days % 2 == 0) {
                System.out.println("Even number of days : " + " " + g.days + " days in " + g.name());
            }
        }
        //З непарною кількістю днів
        for (Month h : list) {
            if (h.days % 2 != 0) {
                System.out.println("Odd number of days : " + " " + h.days + " days in " + h.name());
            }
        }
        for (Month p : list) {
            if (month.equals(p)) {
                if (p.days % 2 == 0) {
                    System.out.println(p.name() + " has " + " even " + p.days + " days ");
                } else {
                    System.out.println(p.name() + " has " + " odd " + p.days + " days ");
                }
            }
        }
    }
}
