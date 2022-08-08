
package codingTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//백준 10818번 
//[문제]N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
//둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
//모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

public class ArrTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] numArr = new int[n];

		for (int i = 0; i < n; i++) {
			numArr[i] = sc.nextInt();
		}
		Arrays.sort(numArr);

		System.out.println(numArr[0] + " " + numArr[n - 1]);

	}

}
