//[백준] 11653번 소인수분해 
//문제
//정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
//
//출력
//N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.

 

package codingTest;

import java.util.Scanner;

public class Algorithm4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		double sqNum = Math.sqrt(num);
		int k = 2;

		while (k <= sqNum && num != 1) {

			if (num % k == 0) {
				System.out.println(k);
				num /= k;
			} else {
				k++;
			}

		}
		
		if(num !=1) 
		System.out.println(num);

	}

}
