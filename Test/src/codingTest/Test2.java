package codingTest;

//  백준 2739번
//[문제] 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test2 {
	public static void main(String[] args) {
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.println("테스터 케이스 갯수 입력 : ");
		int a = sc.nextInt();

		StringTokenizer st;
		int arr[] = new int[2];

		for (int i = 0; i < a; i++) {

			System.out.println("테스터 입력 : ");
			sc.nextLine();
			String str = sc.nextLine();
			System.out.println("str : " + str);
			st = new StringTokenizer(str, " ");
			j = 0;
			while (st.hasMoreTokens()) {

				arr[j] = Integer.parseInt(st.nextToken());

				j++;
			}
			System.out.println(arr[0] + arr[1]);

		}

	}

}
