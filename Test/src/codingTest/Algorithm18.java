package codingTest;
// 백준 2292 벌집문제 
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algorithm18 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		int range = 2;
		int cnt = 1;

		if (n == 1) {
			System.out.println(1);
		} else {

			while (range <= n) {

				range = range + (6 * cnt);
				cnt++;

			}

			System.out.println(cnt);

		}

	}

}
