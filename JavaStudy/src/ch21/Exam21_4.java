package ch21;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.xml.crypto.Data;

public class Exam21_4 {
	public static void main(String[] args) {
		Bingo b = new Bingo();
		b.display();
	}
}

class BtnHandler implements ActionListener {
	int[][] bingo = new int[5][5]; // ����� 0���� �ʱ�ȭ

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.LIGHT_GRAY);

		// ���õ� ��ư�� ��ǥ Ȯ�� (setName���� ������ ��)
		String xy = btn.getName();
		System.out.println(xy);
		// x y xharAt(0) x y �и�
		char x = '0';
		char y = '1';
		int numX = Integer.parseInt(x + "");
		int numY = Integer.parseInt(y + "");
		bingo[numX][numY] = 1;

		/* ������ �ϼ� Ȯ�� �ڵ� */

		TreeSet<Integer> treeSetX = new TreeSet<Integer>();
		treeSetX.add(numX);
//		Iterator<Integer> itrx = treeSetX.iterator();

		
		TreeSet<Integer> treeSetY = new TreeSet<Integer>();
		treeSetY.add(numY);
//		Iterator<Integer> itry = treeSetY.iterator();
		
		if(treeSetY.size() == 1) {
			if(treeSetX.size() == 5) {
				System.out.println("���� �� ����!");
			}
		}
		


		/* ������ �ϼ� Ȯ�� �ڵ� */

	}

}
