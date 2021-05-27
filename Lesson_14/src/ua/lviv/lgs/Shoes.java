package ua.lviv.lgs;

import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

class Shoes implements Comparable<Shoes> {
	private int size;
	private String brand;

	public Shoes(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Shoes shoes = (Shoes) o;
		return size == shoes.size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(size);
	}

	@Override
	public int compareTo(Shoes shoes) {
		return this.getSize() - shoes.getSize();
	}

	@Override
	public String toString() {
		return "Shoes{" + "size=" + size + ", brand='" + brand + '\'' + '}';
	}
}

