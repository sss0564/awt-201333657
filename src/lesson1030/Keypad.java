package lesson1030;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Keypad extends Frame
{
   TextField display = new TextField();
   
   public Keypad()
   {
      add(display, BorderLayout.NORTH);
      add(buildKeypanel(), BorderLayout.CENTER);
      
      setSize(300, 400);
      setVisible(true);
      
      addWindowListener(new WindowAdapter()
      {
         public void windowClosing(WindowEvent e)
         {
            System.exit(0);
         }
      }
      );
   }
   
   private Panel buildKeypanel()
   {
      Panel panel = new Panel();
      
      panel.setLayout(new GridLayout(4,3));
      panel.add(new KeyButton("1"));
      panel.add(new KeyButton("2"));
      panel.add(new KeyButton("3"));
      panel.add(new KeyButton("4"));
      panel.add(new KeyButton("5"));
      panel.add(new KeyButton("6"));
      panel.add(new KeyButton("7"));
      panel.add(new KeyButton("8"));
      panel.add(new KeyButton("9"));
      panel.add(new KeyButton("*"));
      panel.add(new KeyButton("0"));
      panel.add(new KeyButton("#"));
return panel;
   }
   
   class KeyButton extends Button implements ActionListener
   {
      public KeyButton(String label)
      {
         super(label);
         addActionListener(this);   //this==KeyButton¿« this
      }
      
      @Override
      public void actionPerformed(ActionEvent e) 
      {
         // TODO Auto-generated method stub
         if (e.getSource() instanceof Button)
         {
            Button btn = (Button)e.getSource();
            display.setText(display.getText() + btn.getLabel());
         }   
      }
      
   }
public static void main(String[] args) 
   {
      new Keypad();
   }
}