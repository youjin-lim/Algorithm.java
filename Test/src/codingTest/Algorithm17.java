package codingTest;
// 백준 1110번 더하기 사이클 
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algorithm17 {

	public static int cycle(int n) {

		int num = -1;
		int cnt = 1;
		boolean flg = true;

		num = (n % 10) * 10 + (n / 10 + n % 10) % 10;
		if (num == n) {
			flg = !flg;

		}

		while (flg) {

			num = (num % 10) * 10 + (num / 10 + num % 10) % 10;
			cnt++;

			if (num == n)
				break;

		}
		return cnt;

	}

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		System.out.println(cycle(n));

	}

}
