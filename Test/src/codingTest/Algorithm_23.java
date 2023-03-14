package codingTest;
// 백준 3003번 킹,퀸,룩,비숍,나이트, 폰
import java.util.Scanner;

public class Algorithm_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 킹1 , 퀸1, 룩2, 비숍2, 나이트2, 폰8
        int king =1;
        int queen =1;
        int rooks=2;
        int bishops=2;
        int knights=2;
        int pawns=8;

        king = king- sc.nextInt();
        queen = queen -sc.nextInt();
        rooks = rooks -sc.nextInt();
        bishops = bishops - sc.nextInt();
        knights = knights- sc.nextInt();
        pawns = pawns - sc.nextInt();
        System.out.println(king+" "+queen+" "+rooks+" "+bishops+" "+knights+" "+pawns);
    }
}
