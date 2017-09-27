package Day6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Events extends JFrame {
 public JLabel label;
 private JButton button;
 private JLabel label1;
 private JButton button1;
 
 public Events(){
	 setLayout(new FlowLayout());
	 button=new JButton("Click to get text");
	 add(button);
	 label=new JLabel("");
	 add(label);
	 label1=new JLabel("");
	 add(label1);
	 button1=new JButton("Click to clear text");
	 add(button1);
	 event e=new event();
	 button.addActionListener(e);
	 event1 e1=new event1();
	 button1.addActionListener(e1);
 }
 class event implements ActionListener{
	 @Override
	 public void actionPerformed(ActionEvent e){
		 label.setText("Now you can see the text of label");
	 }
}
class event1 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e1){
		label1.setText("hello");
		getContentPane().setBackground(Color.white);
		
	}
}
public static void main(String[] args){
	Events Gui=new Events();
	Gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Gui.setTitle("First Event Frame");
	Gui.setSize(300,500);
	Gui.setVisible(true);
}
}
