package codingTest;
// 백준 2750번 수 정렬하기 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Algorithm_21 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(bf.readLine()); // 입력받을 숫자의 수

		int[] numArr = new int[num];

		for (int i = 0; i < numArr.length; i++) {

			numArr[i] = Integer.parseInt(bf.readLine());

		}

		Arrays.sort(numArr);

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}

	}

}
