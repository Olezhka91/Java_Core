package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {

		Robot robot = new Robot();
		CoffeRobot coffeRobot = new CoffeRobot();
		RobotDancer robotDancer = new RobotDancer();
		RobotCoocker robotCoocker = new RobotCoocker();

		Robot robotArray[] = { robot, coffeRobot, robotDancer, robotCoocker };
		for (Robot x : robotArray) {
			x.work();

			System.out.println();
		}

		Animal animal = new Animal("Леопард", 20, 7);
		System.out.println("Тварина - " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + ",Вік тварини = " + animal.getAge());

		System.out.println();

		animal.setName("Бик");
		animal.setSpeed(2);
		animal.setAge(14);

		System.out.println("Тварина - " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + ", Вік тварини = " + animal.getAge());
	}
}