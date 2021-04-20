package ua.lviv.lgs.task2;

import java.util.Scanner;

public class Methods extends Exception {

    private int a;
    private int b;




    static void additionOfTwoNumbers(int a, int b) {
        System.out.println("Addttion " + a + " + " + b + " = " + a + b);
    }

    static void substractionOfTwoNumbers(int a, int b) {
        System.out.println("Substraction " + a + " - " + b + " = " + (a - b));
    }

    static void divisionOfTwoNumbers(int a, int b) {
        System.out.println("Division " + a + " / " + b + " = " + a / b);
    }

    static void multiplicationOfTwoNumbers(int a, int b) {
        System.out.println("Multiplication " + a + " * " + b + " = " + a * +b);
    }


    public static void main(String[] args) throws IllegalAccessException, Exception {

        Scanner best = new Scanner(System.in);
        System.out.println("Please enter two integer values");
        int a = best.nextInt();
        int b = best.nextInt();


        class MyOwnException extends Exception {

            public MyOwnException (String message)

            {
                System.err.println("Access denied , a > 0, b > 0, TRY AGAIN!");
            }
        }
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException("Access denied , a < 0, b < 0, TRY AGAIN!");
        } else if (a == 0 && b != 0) {
            throw new ArithmeticException("Access denied , a = 0, b! = 0, TRY AGAIN!");
        } else if (a != 0 && b == 0) {
            throw new ArithmeticException("Access denied , a! = 0, b = 0, TRY AGAIN!");
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("Access denied , a = 0, b = 0, TRY AGAIN!");
        }

        else if  (a>0 && b>0){
            throw new MyOwnException("\"");
        }

        additionOfTwoNumbers(a, b);
        substractionOfTwoNumbers(a, b);
        divisionOfTwoNumbers(a, b);
        multiplicationOfTwoNumbers(a, b);
    }
}
