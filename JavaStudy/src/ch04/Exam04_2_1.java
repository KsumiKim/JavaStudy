package ch04;

public class Exam04_2_1 {
	public static void main(String[] args) {
		int score = 20;
		// �ڵ� �ۼ�
		if (score % 2 == 0) {
			if (score % 3 == 0) {
				System.out.println("��¦");
			} else {
				System.out.println("¦");
			}
		} else if (score % 3 == 0) {
			System.out.println("��");
		} else {
			System.out.println("score");
		}
	}

}
