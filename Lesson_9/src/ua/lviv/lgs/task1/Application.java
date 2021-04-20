package ua.lviv.lgs.task1;

import java.util.Scanner;

class WrongInputConsoleParametersException extends Exception {

    WrongInputConsoleParametersException(String message) {
        super(message);
    }

}

public class Application {


    public static void main(String[] args) throws WrongInputConsoleParametersException {

        System.out.println("Enter the name of month from keyboard =  ");
        Scanner one = new Scanner(System.in);
        String newMonthFromKeyboard = one.next();
        Month month = Month.valueOf(newMonthFromKeyboard.toUpperCase());

        if (newMonthFromKeyboard.toUpperCase().equals(Month.APRIL.name())) {
            System.out.println("It`s April");
        } else if (newMonthFromKeyboard.toUpperCase().equals(Month.FEBRUARY.name()))
            System.out.println("It`s February");
        else if (newMonthFromKeyboard.toUpperCase().equals(Month.JANUARY.name()))
            System.out.println("It`s January");
        else if (newMonthFromKeyboard.toUpperCase().equals(Month.DECEMBER.name()))
            System.out.println("It`s December");
        else if (newMonthFromKeyboard.toUpperCase().equals(Month.NOVEMBER.name()))
            System.out.println("It`s November");
        else if (newMonthFromKeyboard.toUpperCase().equals(Month.OCTOBER.name()))
            System.out.println("It`s October");
        else if (newMonthFromKeyboard.toUpperCase().equals(Month.SEPTEMBER.name()))
            System.out.println("It`s September");
        else if (newMonthFromKeyboard.toUpperCase().equals(Month.AUGUST.name()))
            System.out.println("It`s August");
        else if (newMonthFromKeyboard.toUpperCase().equals(Month.JULY.name()))
            System.out.println("It`s July");
        else if (newMonthFromKeyboard.toUpperCase().equals(Month.JUNE.name()))
            System.out.println("It`s June");
        else if (newMonthFromKeyboard.toUpperCase().equals(Month.MAY.name()))
            System.out.println("It`s May");
        else if (newMonthFromKeyboard.toUpperCase().equals(Month.MARCH.name()))
            System.out.println("It`s March");

        else {
            throw new WrongInputConsoleParametersException("There no such month, enter name of month carefully");
        }




//         Seasons.WINTER [] winter  = {Month.DECEMBER, Month.JANUARY, Month.FEBRUARY};
        if (newMonthFromKeyboard.toUpperCase().equals(Month.APRIL.name()) || newMonthFromKeyboard.toUpperCase().equals(Month.MAY.name()) || newMonthFromKeyboard.toUpperCase().equals(Month.MARCH.name())) {
            System.out.println("The month of the same season : " + Month.APRIL.name() + "," + " " + Month.MAY.name() + "," + " " + Month.MARCH.name() + ".");
        } else if (newMonthFromKeyboard.toUpperCase().equals(Month.JUNE.name()) || newMonthFromKeyboard.toUpperCase().equals(Month.JULY.name()) || newMonthFromKeyboard.toUpperCase().equals(Month.AUGUST.name())) {
            System.out.println("The month of the same season : " + Month.JULY.name() + "," + " " + Month.JUNE.name() + "," + " " + Month.AUGUST.name() + ".");
        } else if (newMonthFromKeyboard.toUpperCase().equals(Month.SEPTEMBER.name()) || newMonthFromKeyboard.toUpperCase().equals(Month.OCTOBER.name()) || newMonthFromKeyboard.toUpperCase().equals(Month.NOVEMBER.name())) {
            System.out.println("The month of the same season : " + Month.SEPTEMBER.name() + "," + " " + Month.OCTOBER.name() + "," + " " + Month.NOVEMBER.name() + ".");
        } else if (newMonthFromKeyboard.toUpperCase().equals(Month.DECEMBER.name()) || newMonthFromKeyboard.toUpperCase().equals(Month.FEBRUARY.name()) || newMonthFromKeyboard.toUpperCase().equals(Month.JANUARY.name())) {
            System.out.println("The month of the same season : " + Month.DECEMBER.name() + "," + " " + Month.FEBRUARY.name() + "," + " " + Month.JANUARY.name() + ".");
        } else {
            System.out.println("Wrong input");
        }
        // Виводимо кількість днів для місяця введеного з консолі
        for (Month m : Month.values()) {
            if (month.equals(m)) {
                System.out.println("There " + " " + m.days + " days in " + m.name());
            }
        }
        // Виводимо місяці які мають таку ж кількість днів
        for (Month b : Month.values()) {
            if (b.days == month.days) {
                System.out.println("Month with the same number of days : " + b);
            }
        }
        // Виводимо місяці з меншою кількістю  днів
        for (Month c : Month.values()) {
            if (c.days < month.days) {
                System.out.println("Month with the less quantity of days: " + c);
            }
        }
        //Місяці з більшою кількістю днів
        for (Month d : Month.values()) {
            if (month.days < d.days) {
                System.out.println("Month with the higher quantity of days: " + d);
            }
        }
//        //Наступна пора року
        for (Month e : Month.values()) {
            if (e.season.ordinal() == month.season.ordinal() + 1) {

                System.out.println("Next season " + e.getSeason());
            }
        }

        //Попередня пора року
        for (Month f : Month.values()) {
            if (month.season.ordinal() - 1 == f.season.ordinal()) {

                System.out.println("Previous season " + f.getSeason());
            }
        }
        for (Month g : Month.values()) {
            if (g.days % 2 == 0) {
                System.out.println("Even number of days : " + " " + g.days + " days in " + g.name());
            }
        }
        for (Month h : Month.values()) {
            if (h.days % 2 != 0) {
                System.out.println("Odd number of days : " + " " + h.days + " days in " + h.name());
            }
        }
        for (Month p : Month.values()) {
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