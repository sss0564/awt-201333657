package lesson1030;
//Frame Ŭ������ ��ӹ��� �ʰ� ����ǥ���ٿ� "Car Frame"�̶�� Ÿ��Ʋ�� ������ �������� �����Ͽ�
//ȭ�鿡 ����ϴ� Car��� Ŭ������ ���� ���

import java.awt.Frame;

public class Car {
	public static void main(String[] args) {
		Frame f = new Frame();
		
		f.setTitle(f.getTitle() + "frame");
		//f.setTitle("Car Frame"); //â�� ����
		f.setLocation(600,300); //â�� ��ġ
		f.setSize(300,300); //â�� ũ��
		f.setVisible(true); //â�� ����
	}
}