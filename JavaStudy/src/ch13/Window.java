package ch13;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) {

		JFrame frame = new JFrame("������");
		JButton button = new JButton("���� ��ư");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
//    		button.addMouseListener(new MouseListener() { //�͸�Ŭ����
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub		
//			}
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub			
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//			}
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub	
//			}
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub			
//			}});

		
		MyMouseListener ml = new MyMouseListener();
		button.addMouseListener(ml);

		frame.setLayout(new FlowLayout()); //��ư ������
		button.setPreferredSize(new Dimension(100, 60));
		
		button.setBackground(Color.PINK); //��ư ����

		frame.add(button);
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
