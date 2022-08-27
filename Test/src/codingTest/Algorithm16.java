package codingTest;
// 백준2884
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algorithm16 {

	public static void alarm(int h, int m) {

		if (h > 0) {
			if (m >= 45) {
				System.out.println(h + " " + (m - 45));
			} else {
				System.out.println((h - 1) + " " + (m + 15));
			}

		} else {

			if (m >= 45) {
				System.out.println(h + " " + (m - 45));
			} else {
				System.out.println(23 + " " + (m + 15));
			}

		}

	}
	
	
	public static void main(String[] args) throws Exception{
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m =Integer.parseInt(st.nextToken());
		
		alarm(h,m);
		
		
		
		
	}
	
	
	

}
