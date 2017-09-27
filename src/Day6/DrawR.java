package Day6;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class DrawRect extends JComponent{
public void paint(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(10, 20, 200, 300);
	g.setColor(Color.RED);
	g.fillOval(10, 20, 200, 300);
	g.drawLine(50, 30, 60, 100);
}
}

public class DrawR{
	public static void main(String[] a){
		JFrame window=new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 300, 300);
		window.getContentPane().add(new DrawRect());
		window.setVisible(true);
	}
}