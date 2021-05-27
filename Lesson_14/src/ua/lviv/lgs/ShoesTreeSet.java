package ua.lviv.lgs;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ShoesTreeSet {
	public static void main(String[] args) {
		SortedSet<Shoes> shoes = new TreeSet<>();
		shoes.add(new Shoes(45, "Nike"));
		shoes.add(new Shoes(41, "Reebok"));
		shoes.add(new Shoes(44, "Puma"));
		shoes.add(new Shoes(46, "Adidas"));
		shoes.add(new Shoes(43, "LaCost"));

		System.out.println("Unsorted set of shoes: " + shoes);
		shoes = new TreeSet<>(Comparator.comparing(Shoes::getBrand));

		shoes.add(new Shoes(45, "Nike"));
		shoes.add(new Shoes(41, "Reebok"));
		shoes.add(new Shoes(44, "Puma"));
		shoes.add(new Shoes(46, "Adidas"));
		shoes.add(new Shoes(43, "LaCost"));
		
		System.out.println();

		System.out.println("Sorted set by shoes brand " + shoes);
		
		shoes = new TreeSet<>(Comparator.comparing(Shoes::getSize));

		shoes.add(new Shoes(45, "Nike"));
		shoes.add(new Shoes(41, "Reebok"));
		shoes.add(new Shoes(44, "Puma"));
		shoes.add(new Shoes(46, "Adidas"));
		shoes.add(new Shoes(43, "LaCost"));

		System.out.println();

		System.out.println("Sorted set by shoes size " + shoes);

		shoes = new TreeSet<>(Comparator.comparing(Shoes::getSize).reversed());

		shoes.add(new Shoes(45, "Nike"));
		shoes.add(new Shoes(41, "Reebok"));
		shoes.add(new Shoes(44, "Puma"));
		shoes.add(new Shoes(46, "Adidas"));
		shoes.add(new Shoes(43, "LaCost"));

		System.out.println();
		System.out.println("Sorted set by shoes size (DESC) " + shoes);
	}
}