package codingTest;

import java.util.Scanner;
import java.util.StringTokenizer;

//대소 비교 프로그램 
public class Test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요 : ");
		String str = sc.nextLine();

		StringTokenizer st = new StringTokenizer(str, " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}

	}

}
