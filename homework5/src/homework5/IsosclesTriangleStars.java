package homework5;

public class IsosclesTriangleStars {
	void A03() {
		System.out.print("�̵�ﰢ�� ���̸� �Է� : ");
		String input = new ExamForWhileStars().input();
		int inputNum = Integer.parseInt(input);
		for (int i = 0; i < inputNum; i++) {
			for (int j = 0; j < inputNum - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}

			System.out.println("");

		}
	}
}
