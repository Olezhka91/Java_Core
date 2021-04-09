package ua.lviv.lgs;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

//		Task 1

		byte a = 1;
		short b = 222;
		int c = 33;
		long d = 4444;

		double e = 5.55555;
		float f = 6.66666f;

		char g = 'w';
		boolean j = true;
		System.out.println("a=" + a + ";b=" + b);
		System.out.println("c=" + c + ";d=" + d);
		System.out.println("e=" + e + ";f=" + f);
		System.out.println("g=" + g + ";j=" + j);

		System.out.println("");

//		Task 2

		System.out.println("Byte=" + Byte.MIN_VALUE + "-" + Byte.MAX_VALUE);
		System.out.println("Short=" + Short.MIN_VALUE + "-" + Short.MAX_VALUE);
		System.out.println("Int=" + Integer.MIN_VALUE + "-" + Integer.MAX_VALUE);
		System.out.println("Long=" + Long.MIN_VALUE + "-" + Long.MAX_VALUE);
		System.out.println("");
		System.out.println("Double=" + Double.MIN_VALUE + "-" + Double.MAX_VALUE);
		System.out.println("Float=" + Float.MIN_VALUE + "-" + Float.MAX_VALUE);
		System.out.println("");

//		Task 3

		int array[] = { 44, 15, 65, 154, 358, 3, 68, 25, 4, 54 };

		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
	}

}