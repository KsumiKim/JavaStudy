package ch21;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LEG_LOGIN {
	public static void main(String[] args) {

		JFrame frame = new JFrame("�α��� ȭ��");

		JPanel panel1 = new JPanel(); // ���̵�
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
		panel1.add(new JLabel("ID: "));
		JTextField idText = new JTextField(10);
		panel1.add(idText);

		JPanel panel2 = new JPanel(); // ��й�ȣ
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel2.add(new JLabel("password: "));
		JTextField passwordText = new JTextField(10);
		panel2.add(passwordText);

		JPanel panel3 = new JPanel(); // ���̵� ��й�ȣ ��ġ
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		panel3.add(panel1);
		panel3.add(panel2);

		frame.add(panel3, BorderLayout.CENTER);

		JButton button = new JButton("�α���");
		frame.add(button, BorderLayout.SOUTH);// �α���
		
		MouseListener ml = new MouseListener() {
			int count = 0;
			public void mouseClicked(MouseEvent arg0) {
				String id = "ai";
				String password = "1234";
				String inputid = idText.getText();
				String inputps = passwordText.getText();
				
				
					if (id.equals(inputid) && password.equals(inputps)) {
						System.out.println("�α��� �Ǿ����ϴ�");
						JFrame frame2 = new JFrame("�α��� �Ϸ�");
						frame2.setSize(400, 400);
						frame2.setVisible(true);
						
					} else if (id.equals(inputid)) {
						count++;
						System.out.println(count + "   ��й�ȣ ����!!");
					} else if (password.equals(inputps)) {
						count++;
						System.out.println(count + "   ���̵� ����!!");
					} else {
						count++;
						System.out.println(count + "   ����!!");
				}
					if (count >= 5) {
						frame.setVisible(false);
					}
			}

			public void mouseEntered(MouseEvent arg0) {
			}

			public void mouseExited(MouseEvent arg0) {
			}

			public void mousePressed(MouseEvent arg0) {
			}

			public void mouseReleased(MouseEvent arg0) {
			}

		};

		button.addMouseListener(ml);

		frame.pack();
		frame.setSize(400, 150);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
