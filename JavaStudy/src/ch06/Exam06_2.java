package ch06;

public class Exam06_2 {
	public static void main(String[] args) {
		int n = 100;
		int total = sum(n);
		System.out.println("1 ~ " + n + " ������ �� : " + total);
	}

	public static int sum(int num) {

		int totalme = 0;
		for (int i = 1; i <= num; i++) {
			totalme += i;
		}
		return totalme;
	}
	// �޼ҵ� �ۼ�
}
