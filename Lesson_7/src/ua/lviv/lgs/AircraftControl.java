package ua.lviv.lgs;

public class AircraftControl {
	int distance = 100;
	
	void getUp() {
		System.out.println("Літак піднявся на :" + (int) (Math.random() * (distance)) + "км");

	}

	void getDown() {
		System.out.println("Літак опустився на :" + (int) (Math.random() * (distance)) + "км");
	}

	void getLeft() {
		System.out.println("Літак повернув вліво на :" + (int) (Math.random() * (distance)) + "км");
	}

	void getRight() {
		System.out.println("Літак повернув вправо на :" + (int) (Math.random() * (distance)) + "км");
	}
}