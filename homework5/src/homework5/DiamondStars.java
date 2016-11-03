package homework5;

public class DiamondStars {
	void A04() {
		System.out.print("다이아몬드의 크기입력 : ");
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

		for (int i = inputNum - 2; i >= 0; i--) {
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
