package ua.lviv.lgs;

public abstract class Aircraft extends AircraftControl{
	int length;
	int width;
	int weight;

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	int i = 20 + (int) (Math.random() * 69);
	float d = (float) (Math.random() * 1001);

	public int setStartEngine() {
		System.out.println("��� �� ����� �����:" + i + "���");
		return 0;
	}

	public int setFlightUp() {
		System.out.println("��������� ��� ��������� ���� � ������ �����: " + d + "��");
		return 0;
	}

	public String getLanding() {
		System.out.println("˳��� ��� �� �������");
		return null;
	}

}
