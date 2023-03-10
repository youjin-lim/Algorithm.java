package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm22 {
   //  프로그래머스 바탕화면 정리 문제  https://school.programmers.co.kr/learn/courses/30/lessons/161990?language=java
    //wallpaper : 바탕화면의 상태를 나타낸 문자 배열
    // 빈칸은 .  파일이 있는 칸은 #
    //드래그 하면 파일 선택 할 수 있고 선택된 파일들은 삭제 가능
    // 최소한의 이동거리를 같는 한번의 드래그로 모든 파일을 선택해서 한번에 지우려고한다.
    // 최소한의 이동거리를 같는 드래그의 시작점과 끝넘을 담은 정수배열을 리턴하는 solution 함수를 작성하라.


    public static void main(String[] args) {
        // 주어진 wallpage 최대 큭 ㅣ 50*50
        String[] wallpaper = {".#...", "..#..", "...#."};
        //총 행의수
        int x = wallpaper.length;
        //총 열의 수
        int y = wallpaper[0].length();
        // 각 행을 돌면서 가장 작은 행, 열 찾고 가장 큰 행,열 찾기
        int max_line =1;
        int min_line=50;
        int max_row=1;
        int min_row=50;
        for(int i=0; i<x ; i++){
            List<Integer> list = new ArrayList<>();
            int point = 0;
           while (true){
               int maybe = wallpaper[i].indexOf("#",point);
               if(maybe ==-1){
                   break;
               }
               point = maybe+1;
               max_line =(max_line < i+1) ? i+1 : max_line;
               min_line = (min_line < i) ? min_line : i ;
               max_row = (max_row < maybe+1) ? maybe+1 : max_row;
               min_row = (min_row < maybe) ? min_row : maybe ;
           }
        }
        int[] answer = {min_line,min_row,max_line,max_row};
        System.out.println(Arrays.toString(answer));
    }

}
