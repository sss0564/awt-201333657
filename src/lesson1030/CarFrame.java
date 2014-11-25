package lesson1030;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CarFrame extends Frame implements WindowListener{
	public CarFrame() {
		//Frame f = this;
		//f.setTitle("Car Frame");
		//this.setTitle("Car Frame");
		
		//Button btn1 = new Button();

		/*btn1.setLabel("BTN1");
		btn1.setSize(40,15);
		btn1.setLocation(50,50);
		
		
		btn1.setBounds(50, 50, 40, 15);
		
		this.add(btn1, "NORTH");		
		this.add(new Button("BTN2"), BorderLayout.SOUTH);
		this.add(new Button("BTN3"));
		this.add(new Button("BTN4"));
		this.add(new Button("BTN5"));
		
		setLayout(new FlowLayout());
		//FlowLayout layout = new FlowLayout();
		//setLayout(layout);
		setLayout(null);*/
		

		//패널은 모양이X
		Panel panel = new Panel();
		
		//MyListener listener = new MyListener();
		//this.addWindowListener(new MyWindowListener());//1번방법
		//this.addWindowListener(new MyWindowListener2());//2번방법
		//addWindowListener(this);//3번방법
		addWindowListener( new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);}
		});
		
				Button btn1 = new Button("btn1");
		//btn1.addActionListener(listener);
		panel.add(new Button("btn1"));
		
		Button btn2 = new Button("btn2");
		//btn2.addActionListener(listener);
		panel.add(btn2);
		
		panel.add(new Button("btn3"));
		panel.add(new Button("btn4"));
		panel.add(new Button("btn5"));
		
		panel.setBackground(Color.GREEN);
		this.add(panel, BorderLayout.NORTH);
		

		
		setTitle("Car Frame");
		setSize(400,600);
		setVisible(true);
	}
	
	//이벤트
		class MyListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
		//System.out.println("Click...");
				Button btn = (Button)e.getSource();
				btn.setBackground(Color.RED);
				
			}
		}
			//class MyWindowListener implements WindowListener{

				@Override
				public void windowActivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowClosed(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowClosing(WindowEvent e) {
					// TODO Auto-generated method stub
					System.exit(0);
				}

				@Override
				public void windowDeactivated(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowDeiconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowIconified(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowOpened(WindowEvent e) {
					// TODO Auto-generated method stub
					
				}			

			class MyWindowListener2 extends WindowAdapter {
				
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}}
			
public static void main(String[] args) {
	new CarFrame();
}}