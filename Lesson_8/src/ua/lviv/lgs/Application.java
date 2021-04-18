package ua.lviv.lgs;

import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("��������� 1 ��� ��������� �� � ����� �����");
		System.out.println("��������� 2 ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("��������� 3 ��� ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("��������� 4 ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("��������� 5 ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("��������� 6 ��� ������� �� ����� �������� ���� ����");
		System.out.println("��������� 7 ��� ������� �� ����� ��������� ���� ����");
		System.out.println("��������� 8 ��� �������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("��������� 9 ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("��������� 10 ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");

	}

	public static void main(String[] args) {

		Months[] masMonths = Months.values();
		Seasons[] masSeasons = Seasons.values();
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				menu();

				switch (scanner.next()) {

				case "1": {
					System.out.println("������ �����");
//					scanner = new Scanner(System.in);
					String month = scanner.next().toUpperCase();

					boolean flag = false;

					for (Months m : masMonths) {
						if (m.name().equals(month)) {
							System.out.println("����� ����� ����");
							flag = true;
						}

					}

					if (!flag) {
						System.out.println("����� ����� �� ����");
					}

					break;
				}

				case "2": {
					System.out.println("������ ���� ����");
//					scanner = new Scanner(System.in);
					String season = scanner.next().toUpperCase();

					boolean flag = false;

					for (Months m : masMonths) {
						if (m.getSeason().name().equals(season)) {
							flag = true;
						}

					}

					if (flag) {
						Seasons seasonsValue = Seasons.valueOf(season);
						for (Months m2 : masMonths) {
							if (m2.getSeason().toString().equalsIgnoreCase(season)) {
								System.out.println(m2);
							}
						}

					}

					if (!flag) {
						System.out.println("����");
					}

					break;
				}

				case "3": {
					System.out.println("������ ������� ���");
//					scanner = new Scanner(System.in);
					int days = scanner.nextInt();

					boolean flag = false;

					for (Months m : masMonths) {
						if (m.getDays() == days) {
							System.out.println(m.name());
							flag = true;
						}

					}

					if (!flag) {
						System.out.println("���� :(");
					}

					break;
				}

				case "4": {
					System.out.println("������ ������� ���");
//					scanner = new Scanner(System.in);
					int days = scanner.nextInt();

					boolean flag = false;

					for (Months m : masMonths) {
						if (m.getDays() < days) {
							System.out.println(m.name());
							flag = true;
						}

					}

					if (!flag) {
						System.out.println("���� :(");
					}

					break;
				}

				case "5": {
					System.out.println("������ ������� ���");
//					scanner = new Scanner(System.in);
					int days = scanner.nextInt();

					boolean flag = false;

					for (Months m : masMonths) {
						if (m.getDays() > days) {
							System.out.println(m.name());
							flag = true;
						}

					}

					if (!flag) {
						System.out.println("���� :(");
					}

					break;
				}

				case "6": {
					System.out.println("������ ���� ����");
//					scanner = new Scanner(System.in);
					String season = scanner.next().toUpperCase();

					boolean flag = false;

					for (Seasons s : masSeasons) {
						if (s.name().equals(season)) {
							flag = true;
						}
					}

					if (flag) {
						System.out.println("�������� ���� ���� ");
						Seasons seasonsValue = Seasons.valueOf(season);
						int ordinal = seasonsValue.ordinal();
						if (ordinal == (masSeasons.length - 1)) {
							ordinal = 0;
							System.out.println(masSeasons[ordinal]);
						} else {
							System.out.println(masSeasons[ordinal + 1]);
						}

					}

					if (!flag) {
						System.out.println("���� :(");
					}

					break;
				}

				case "7": {
					System.out.println("������ ���� ����");
//					scanner = new Scanner(System.in);
					String season = scanner.next().toUpperCase();

					boolean flag = false;

					for (Seasons s : masSeasons) {
						if (s.name().equals(season)) {
							flag = true;
						}
					}

					if (flag) {
						System.out.println("��������� ���� ���� ");
						Seasons seasonsValue7 = Seasons.valueOf(season);
						int ordinal = seasonsValue7.ordinal();
						if (ordinal == 0) {
							ordinal = (masSeasons.length - 1);
							System.out.println(masSeasons[ordinal]);
						} else {
							System.out.println(masSeasons[ordinal - 1]);
						}

					}

					if (!flag) {
						System.out.println("���� :(");
					}

					break;
				}

				case "8": {
					System.out.println("����� ������� ���: ");
//					 scanner = new Scanner(System.in);

					boolean flag = false;

					for (Months m : masMonths) {
						if (m.getDays() % 2 == 0) {
							System.out.println(m.name());
							flag = true;
						}

					}

					break;
				}

				case "9": {
					System.out.println("������� ������� ���");
//					 scanner = new Scanner(System.in);

					boolean flag = false;

					for (Months m : masMonths) {
						if (m.getDays() % 2 != 0) {
							System.out.println(m.name());
							flag = true;
						}
					}

					break;
				}

				case "10": {
					System.out.println("������ �����");
//					scanner = new Scanner(System.in);
					String month = scanner.next().toUpperCase();

					boolean flag = false;

					for (Months m : masMonths) {
						if (m.name().equals(month)) {
							flag = true;
						}

					}

					if (flag) {
						for (Months m : masMonths) {
							if (m.name().equals(month)) {
								if (m.getDays() % 2 == 0) {
									System.out.println("̳���� �� ����� ������� ���");
								} else {
									System.out.println("̳���� �� ������� ������� ���");
								}
							}
						}

					}

					if (!flag) {
						System.out.println("���� :(");
					}

					break;
					
					}

				}

			}
		}

	}
}

