package ua.lviv.lgs.Task_2;

public class Overload {

    int a;
    int b;
    int c;

    public Overload(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Overload(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

}