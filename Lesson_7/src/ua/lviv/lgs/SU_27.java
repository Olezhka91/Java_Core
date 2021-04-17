package ua.lviv.lgs;

public class SU_27 extends Aircraft implements Accessibility{
	
	int maxSpeed = 2500;
	int stealthTiem = 300;
	int maxAtomicBombs = 10;

	@Override
	public void getTurbo() {
		System.out.println("Турбо-швидість: " +(maxSpeed + (int)(Math.random() * 1001)) +"км");
		
	}

	@Override
	public void getStealth() {
		System.out.println("Час під час якого  літак буде невидиий:" + ((int)(Math.random() * (stealthTiem++))) + "сек");
		
	}

	@Override
	public void getNuclear() {
		System.out.println("К-сть бомб які буде скинуто:" + ((int) (Math.random() * maxAtomicBombs)) + "шт");
		
	}
	

}
