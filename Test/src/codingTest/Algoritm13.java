package codingTest;
// [백준] 11047번 그리디 알고리즘 -  동전0 
//
//문제
//준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
//동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Algoritm13 {
	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}

		int money = M;
		int cnt = 0;

		for (int i = arr.length - 1; i >= 0; i--) {

			if (money >= arr[i]) {
				cnt += money / arr[i];
				money -= (arr[i] * (money / arr[i]));

				if (money == 0) {
					System.out.println(cnt);
					break;
				}
			}

		}

	}
}
