package codingTest;
//백준 10815 숫자카드 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Algorithm8_1 {
	public static void main(String[] args) throws Exception {

		StringTokenizer st;

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		// 집합에 담아주기
		HashSet<Integer> set = new HashSet();
		st = new StringTokenizer(bf.readLine());

		for (int i = 0; i < n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}

		int m = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());

		for (int i = 0; i < m; i++) {
			if (set.contains(Integer.parseInt(st.nextToken()))) {
				System.out.print(1 + " ");

			} else {
				System.out.print(0 + " ");

			}
		}

	}
}
