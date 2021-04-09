package ua.lviv.lgs;

public class Application {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        rec.perimeter(rec.width, rec.height);
        rec.area(rec.width, rec.height);

        rec.result();
    }

}