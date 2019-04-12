package ch21;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 {
	public static void main(String[] args) {

		JFrame frame = new JFrame(); // ��� ��ġ ����

		frame.setLayout(new FlowLayout());

		MouseListener ml = new MouseListener() { // ��ư���� ���콺������ ����
			public void mouseReleased(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) { // Ŭ��
				JButton button = (JButton) e.getSource(); // ��ư
				String text = button.getText();
				System.out.println(text);
			}
		};

		JButton button1 = new JButton("��ư1");
		button1.addMouseListener(ml);

		JButton button2 = new JButton();
		button2.setText("��ư2");
		button2.addMouseListener(ml);
		
		frame.setLayout(new FlowLayout()); //��ư2 ������
		button1.setPreferredSize(new Dimension(100, 60));

		frame.add(button1);
		frame.add(button2); // ��ư�߰�

		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}

}
