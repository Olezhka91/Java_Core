package ua.lviv.lgs;

public class AircraftControl {
	int distance = 100;
	
	void getUp() {
		System.out.println("˳��� ������� �� :" + (int) (Math.random() * (distance)) + "��");

	}

	void getDown() {
		System.out.println("˳��� ��������� �� :" + (int) (Math.random() * (distance)) + "��");
	}

	void getLeft() {
		System.out.println("˳��� �������� ���� �� :" + (int) (Math.random() * (distance)) + "��");
	}

	void getRight() {
		System.out.println("˳��� �������� ������ �� :" + (int) (Math.random() * (distance)) + "��");
	}
}