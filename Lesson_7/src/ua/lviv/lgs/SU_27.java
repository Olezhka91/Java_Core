package ua.lviv.lgs;

public class SU_27 extends Aircraft implements Accessibility{
	
	int maxSpeed = 2500;
	int stealthTiem = 300;
	int maxAtomicBombs = 10;

	@Override
	public void getTurbo() {
		System.out.println("�����-�������: " +(maxSpeed + (int)(Math.random() * 1001)) +"��");
		
	}

	@Override
	public void getStealth() {
		System.out.println("��� �� ��� �����  ���� ���� ��������:" + ((int)(Math.random() * (stealthTiem++))) + "���");
		
	}

	@Override
	public void getNuclear() {
		System.out.println("�-��� ���� �� ���� �������:" + ((int) (Math.random() * maxAtomicBombs)) + "��");
		
	}
	

}
