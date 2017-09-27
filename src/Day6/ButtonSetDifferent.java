package Day6;

import javax.swing.*;

public class ButtonSetDifferent {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Laying Out Components Using Absolute Coordinates");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		JLabel label1 = new JLabel("Java Swing");
		JTextField field = new JTextField(20);
		JButton button1 = new JButton("ok");
		JButton button2 = new JButton("Cancel");
		label1.setBounds(0, 0, 100, 50);
		field.setBounds(75, 100, 200, 20);
		button1.setBounds(40, 200, 75, 25);
		button2.setBounds(200, 200, 75, 25);
		panel.add(label1);
		panel.add(field);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setSize(400, 400);
		frame.setVisible(true);

	}
}
