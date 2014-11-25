package lesson1030;
//Frame 클래스를 상속받지 않고 제목표시줄에 "Car Frame"이라는 타이틀이 부착된 프레임을 생성하여
//화면에 출력하는 Car라는 클래스의 생성 방법

import java.awt.Frame;

public class Car {
	public static void main(String[] args) {
		Frame f = new Frame();
		
		f.setTitle(f.getTitle() + "frame");
		//f.setTitle("Car Frame"); //창의 제목
		f.setLocation(600,300); //창의 위치
		f.setSize(300,300); //창의 크기
		f.setVisible(true); //창의 실행
	}
}