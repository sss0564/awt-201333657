package lesson1030;

public class Lesson {
	public static void main(String[] args) {
		try{
			System.out.println(args[0]);
			System.out.println(args[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε����� �����ʴ� ��ȣ�� ������ ��� ����");
		}
	}
}