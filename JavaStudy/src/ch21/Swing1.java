package ch21;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame(); // ��� ��ġ ����

		frame.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("��ư1");
		JButton b2 = new JButton();
		b2.setText("��ư2");

		frame.add(b1);
		frame.add(b2); // ��ư�߰�

		frame.setSize(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}

}
