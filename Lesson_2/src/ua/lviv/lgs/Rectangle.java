package ua.lviv.lgs;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(){}

    //������� ��� ����������� �����
    public double area(double wight,double height){
        this.width = (25.0 * 15.0);
        return wight;
    }

    //������� ��� ����������� ��������� ������������
    public double perimeter(double wight,double height){
        this.height = (60.0+ 65.0)*2;
        return height;
    }

    public void result(){
        System.out.println("����� ������������: "+width);
        System.out.println("�������� ������������: "+height);
    }
}