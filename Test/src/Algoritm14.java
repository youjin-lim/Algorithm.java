import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Algoritm14 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st;

		String arr[] = new String[n];

		String an;
		Stack stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			an = bf.readLine();

			if (an.equals("top")) {

				if(stack.empty()) {
					System.out.println(-1);
				}else {
				
				System.out.println(stack.peek());
				}

			} else if (an.equals("pop")) {

				if (stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.pop());
				}
			} else if (an.equals("size")) {

				System.out.println(stack.size());
			} else if (an.equals("empty")) {

				if (stack.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}

			} else if (an.substring(0, 4).equals("push")) {
				int num = Integer.parseInt(an.substring(5).trim());

				stack.push(num);
			}

		}

	}

}
