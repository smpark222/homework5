package homework5;

public class RectangleStars {
	void A01() {
		System.out.print("���簢�� ũ���Է� : ");
		String input = new ExamForWhileStars().input();
		int inputNum = Integer.parseInt(input);
		for (int i = 0; i <= (inputNum / 2); i++) {
			for (int j = 0; j < inputNum; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
