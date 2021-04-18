package ua.lviv.lgs;

import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("натисн≥сть 1 щоб ѕерев≥рити чи Ї такий м≥с€ць");
		System.out.println("натисн≥сть 2 щоб ¬ивести вс≥ м≥с€ц≥ з такою ж порою року");
		System.out.println("натисн≥сть 3 щоб ¬ивести вс≥ м≥с€ц≥ €к≥ мають таку саму к≥льк≥сть дн≥в");
		System.out.println("натисн≥сть 4 щоб ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають меншу к≥льк≥сть дн≥в");
		System.out.println("натисн≥сть 5 щоб ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають б≥льшу к≥льк≥сть дн≥в");
		System.out.println("натисн≥сть 6 щоб ¬ивести на екран наступну пору року");
		System.out.println("натисн≥сть 7 щоб ¬ивести на екран попередню пору року");
		System.out.println("натисн≥сть 8 щоб ¬¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають парну к≥льк≥сть дн≥в");
		System.out.println("натисн≥сть 9 щоб ¬ивести на екран вс≥ м≥с€ц≥ €к≥ мають непарну к≥льк≥сть дн≥в");
		System.out.println("натисн≥сть 10 щоб ¬ивести на екран чи введений з консол≥ м≥с€ць маЇ парну к≥льк≥сть дн≥в");

	}

	public static void main(String[] args) {

		Months[] masMonths = Months.values();
		Seasons[] masSeasons = Seasons.values();
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				menu();

				switch (scanner.next()) {

				case "1": {
					System.out.println("¬вед≥ть м≥с€ць");
//					scanner = new Scanner(System.in);
					String month = scanner.next().toUpperCase();

					boolean flag = false;

					for (Months m : masMonths) {
						if (m.name().equals(month)) {
							System.out.println("“акий м≥с€ць ≥снуЇ");
							flag = true;
						}

					}

					if (!flag) {
						System.out.println("“акий м≥с€ць не ≥снуЇ");
					}

					break;
				}

				case "2": {
					System.out.println("¬вед≥ть пору року");
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
						System.out.println("’иба");
					}

					break;
				}

				case "3": {
					System.out.println("¬вед≥ть к≥льк≥сть дн≥в");
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
						System.out.println("’иба :(");
					}

					break;
				}

				case "4": {
					System.out.println("¬вед≥ть к≥льк≥сть дн≥в");
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
						System.out.println("’иба :(");
					}

					break;
				}

				case "5": {
					System.out.println("¬вед≥ть к≥льк≥сть дн≥в");
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
						System.out.println("’иба :(");
					}

					break;
				}

				case "6": {
					System.out.println("¬вед≥ть пору року");
//					scanner = new Scanner(System.in);
					String season = scanner.next().toUpperCase();

					boolean flag = false;

					for (Seasons s : masSeasons) {
						if (s.name().equals(season)) {
							flag = true;
						}
					}

					if (flag) {
						System.out.println("Ќаступна пора року ");
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
						System.out.println("’иба :(");
					}

					break;
				}

				case "7": {
					System.out.println("¬вед≥ть пору року");
//					scanner = new Scanner(System.in);
					String season = scanner.next().toUpperCase();

					boolean flag = false;

					for (Seasons s : masSeasons) {
						if (s.name().equals(season)) {
							flag = true;
						}
					}

					if (flag) {
						System.out.println("ѕопередн€ пора року ");
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
						System.out.println("’иба :(");
					}

					break;
				}

				case "8": {
					System.out.println("парна к≥льк≥сть дн≥в: ");
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
					System.out.println("Ќепарна к≥льк≥сть дн≥в");
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
					System.out.println("¬вед≥ть м≥с€ць");
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
									System.out.println("ћ≥с€ць маЇ парну к≥льк≥сть дн≥в");
								} else {
									System.out.println("ћ≥с€ць маЇ непарну к≥льк≥сть дн≥в");
								}
							}
						}

					}

					if (!flag) {
						System.out.println("’иба :(");
					}

					break;
					
					}

				}

			}
		}

	}
}

