package homework5;

public class TriangleStars {
	void A02() {
		System.out.println("직각삼각형의 왼쪽여백과 높이입력 ");
		System.out.print("왼쪽 여백 : ");
		String input1 = new ExamForWhileStars().input();
		System.out.print("높이 : ");
		String input2 = new ExamForWhileStars().input();
		int input1Num = Integer.parseInt(input1);
		int input2Num = Integer.parseInt(input2);

		for (int i = 0; i < input2Num; i++) {
			for (int j = 0; j < input1Num + 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}
}
