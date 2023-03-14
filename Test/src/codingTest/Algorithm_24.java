package codingTest;

import java.util.Scanner;
// 백준 10870번 
public class Algorithm_24 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        System.out.println(function(n));

    }



    public static int function(int n){
        if (n <=1){
            return  n;
        }
        return function(n-1) + function(n-2);
    }

}
