package codingTest;
// 백준 5086
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm10 {

	public static String matTest(int a, int b) {

		if (a == 0 || b == 0) {
			return "neither";
		} else {

			if (b % a == 0) {
				return "factor";
			} else if (a % b == 0) {
				return "multiple";
			} else {
				return "neither";
			}
		}

	}

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		while (true) {

			st = new StringTokenizer(bf.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0)
				break;
			System.out.println(matTest(a, b));

		}

	}

}
