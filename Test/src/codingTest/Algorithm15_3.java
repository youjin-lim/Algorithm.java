package codingTest;
// 백준 18258번
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Algorithm15_3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Deque<Integer> q = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {

			case "push":

				q.offer(Integer.parseInt(st.nextToken()));
				break;

			case "pop":

				Integer item = q.poll();
				if (item == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(item).append('\n');
				}
				break;

			case "size":
				sb.append(q.size()).append('\n');
				break;

			case "empty":
				if (q.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
				break;

			case "front":
				Integer ite = q.peek();
				if (ite == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(ite).append('\n');
				}
				break;

			case "back":
				Integer it = q.peekLast();
				if (it == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(it).append('\n');
				}
				break;
			}

		}

		System.out.println(sb);

	}
}