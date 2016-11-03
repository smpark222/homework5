package homework5;

import java.util.*;

public class ExamForWhileStars {
	public static void main(String[] args) {
		while (true) {
			System.out.println("1. ���簢�� �����");
			System.out.println("2. �����ﰢ �����");
			System.out.println("3. �̵�ﰢ�� ��");
			System.out.println("4. ���̾Ƹ�� �����");
			System.out.println("5. �����ϱ�");
			System.out.println("���ϴ� �޴���>> ");
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
				System.out.println("���ڸ� �ٽ�  �Է����ּ���");
				break;
			}
		}
	}

	public static String input() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
