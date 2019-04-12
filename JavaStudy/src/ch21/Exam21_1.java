package ch21;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam21_1 {
	public static void main(String[] args) {

		String[] datas = { "A", "B", "C", "D", "E", "F", "G" };

		JFrame frame = new JFrame();
		frame.setBounds(120, 120, 300, 200);
		/* JFrame�� Layout�� GridLayout ���� ���� */
		
		frame.setLayout(new GridLayout(0, 3));
		

		/* �迭�� �̿��Ͽ� JButton ���� ǥ�� */
		for (String s : datas) {
			frame.add(new JButton(s));
		}

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
