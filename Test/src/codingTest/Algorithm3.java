// 백준 10872번 
// n! 출력하기 . 

package codingTest;

import java.util.Scanner;

public class Algorithm3 {

	 static int factorial(int n, int total) {

		if (n <= 1) {
			return total;
		}

		return factorial(n-1, n*total);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(factorial(sc.nextInt(),1));

	}

}
