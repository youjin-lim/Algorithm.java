package codingTest;
// 백준 1085 직사각형 탈출 문제 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Algorithm9 {

	static int disteance(int x, int y, int w, int h) {

		int arr[] = { x, y, w - x, h - y };
		Arrays.sort(arr);

		return arr[0];

	}

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());

		System.out.println(disteance(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));

	}

}
