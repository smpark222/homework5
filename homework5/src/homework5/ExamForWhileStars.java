package homework5;

import java.util.*;

public class ExamForWhileStars {
	public static void main(String[] args) {
		while (true) {
			System.out.println("1. 정사각형 별찍기");
			System.out.println("2. 직각삼각 별찍기");
			System.out.println("3. 이등변삼각형 별");
			System.out.println("4. 다이아몬드 별찍기");
			System.out.println("5. 종료하기");
			System.out.println("원하는 메뉴는>> ");
			String input = input();
			int inputNum = Integer.parseInt(input);

			switch (inputNum) {
			case 1:
				new RectangleStars().A01();
				break;
			case 2:
				new TriangleStars().A02();
				break;
			case 3:
				new IsosclesTriangleStars().A03();
				break;
			case 4:
				new DiamondStars().A04();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("숫자를 다시  입력해주세요");
				break;
			}
		}
	}

	public static String input() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
