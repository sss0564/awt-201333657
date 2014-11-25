package Calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Design extends JFrame {

	JTextField jf;
	JButton n0;
	JButton n1;
	JButton n2;
	JButton n3;
	JButton n4;
	JButton n5;
	JButton n6;
	JButton n7;
	JButton n8;
	JButton n9;

	JButton plus;
	JButton minus;
	JButton divide;
	JButton multi;
	JButton point;
	JButton clear;
	JButton equal;

	Numpad np;
	Act ac;

	JPanel main;
	JPanel key;
	JPanel key2;
	String operator = "";
	String temp = "";
	double result = 0;
	double mem;

	public Design() {
		np = new Numpad();
		ac = new Act();
		main = new JPanel(new BorderLayout());
		// 키 패널 ~ 9 , . , = <- 1
		key = new JPanel(new GridLayout(4, 3, 5, 5));
		// 키 패널 + - / * <- 2
		key2 = new JPanel(new GridLayout(4, 3, 5, 5));
		jf = new JTextField("0");
		jf.setHorizontalAlignment(JTextField.RIGHT);
		n1 = new JButton("1");
		n2 = new JButton("2");
		n3 = new JButton("3");
		n4 = new JButton("4");
		n5 = new JButton("5");
		n6 = new JButton("6");
		n7 = new JButton("7");
		n8 = new JButton("8");
		n9 = new JButton("9");
		n0 = new JButton("0");
		plus = new JButton("+");
		minus = new JButton("-");
		multi = new JButton("*");
		divide = new JButton("/");
		equal = new JButton("=");
		clear = new JButton("C");

		// key 1 insert
		key.add(n9);
		key.add(n8);
		key.add(n7);
		key.add(n6);
		key.add(n5);
		key.add(n4);
		key.add(n3);
		key.add(n2);
		key.add(n1);
		key.add(n0);
		key.add(equal);
		key.add(clear);

		// key2 2 insert
		key2.add(plus);
		key2.add(minus);
		key2.add(divide);
		key2.add(multi);

		// 숫자 키패드 이벤트 장착
		n0.addActionListener(np);
		n1.addActionListener(np);
		n2.addActionListener(np);
		n3.addActionListener(np);
		n4.addActionListener(np);
		n5.addActionListener(np);
		n6.addActionListener(np);
		n7.addActionListener(np);
		n8.addActionListener(np);
		n9.addActionListener(np);
		n0.addActionListener(np);

		// 연산 버튼 및 초기화 버튼에 이벤트 장착
		minus.addActionListener(ac);
		plus.addActionListener(ac);
		divide.addActionListener(ac);
		multi.addActionListener(ac);
		clear.addActionListener(ac);
		equal.addActionListener(ac);

		// 패널 장착
		main.add("North", jf);
		main.add("West", key);
		main.add("Center", key2);
		this.add(main);
	}

	class Numpad implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (n0 == e.getSource()) {
				temp += "" + 0;
				jf.setText(temp);

			} else if (n1 == e.getSource()) {
				temp += "" + 1;
				jf.setText(temp);
			} else if (n2 == e.getSource()) {
				temp += "" + 2;
				jf.setText(temp);
			} else if (n3 == e.getSource()) {
				temp += "" + 3;
				jf.setText(temp);
			} else if (n4 == e.getSource()) {
				temp += "" + 4;
				jf.setText(temp);
			} else if (n5 == e.getSource()) {
				temp += "" + 5;
				jf.setText(temp);
			} else if (n6 == e.getSource()) {
				temp += "" + 6;
				jf.setText(temp);
			} else if (n7 == e.getSource()) {
				temp += "" + 7;
				jf.setText(temp);
			} else if (n8 == e.getSource()) {
				temp += "" + 8;
				jf.setText(temp);
			} else if (n9 == e.getSource()) {
				temp += "" + 9;
				jf.setText(temp);
			}
		}
	}

	class Act implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(plus)) { // 더하기
				if (!plus.equals("")) {
					operator = "+";
					jf.setText(temp);
					mem = Double.parseDouble(temp);
					temp = "";
				}

			} else if (e.getSource().equals(minus)) { // 빼기
				if (!plus.equals("")) {
					operator = "-";
					jf.setText(temp);
					mem = Double.parseDouble(temp);
					temp = "";
				}
			} else if (e.getSource().equals(multi)) { // 곱하기
				if (!plus.equals("")) {
					operator = "*";
					jf.setText(temp);
					mem = Double.parseDouble(temp);
					temp = "";
				}
			} else if (e.getSource().equals(divide)) { // 나누기
				if (!plus.equals("")) {
					operator = "/";
					jf.setText(temp);
					mem = Double.parseDouble(temp);
					temp = "";
				}
			} else if (e.getSource().equals(equal)) { // =
				if (!temp.equals("")) {
					if (operator.equals("+")) {
						result = mem + Double.parseDouble(temp);
						jf.setText(Double.toString(result));
						temp = Double.toString(result);

					} else if (operator.equals("-")) {
						result = mem - Double.parseDouble(temp);
						jf.setText(Double.toString(result));
						temp = Double.toString(result);
					} else if (operator.equals("/")) {
						result = mem / Double.parseDouble(temp);
						jf.setText(Double.toString(result));
						temp = Double.toString(result);
					} else if (operator.equals("*")) {
						result = mem * Double.parseDouble(temp);
						jf.setText(Double.toString(result));
						temp = Double.toString(result);
					} else if (operator.equals("=")) {
						result = mem - Double.parseDouble(temp);
						jf.setText(Double.toString(result));
						temp = Double.toString(result);
					}
				}
			} else if (e.getSource().equals(clear)) {
				temp = "0";
				jf.setText(temp);
			}
		}
	}
}
public class calculator {
	public static void main(String[] args) {
		Design ds = new Design();
		ds.setTitle("계산기");
		ds.setSize(250, 250);
		ds.setVisible(true);
		ds.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
