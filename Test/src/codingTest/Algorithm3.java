// 백준 10872번 
// n! 출력하기 . 

package codingTest;


import java.util.Scanner;

public class Algorithm3 {

	public static int factorial(int n) {

		if(n<=1) {
			return 1;
		}
		
		return factorial(n-1)*n;
		
	}

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);

		System.out.println(factorial(sc.nextInt()));
		

	}

}
