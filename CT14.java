/*자릿수더하기
문제 설명
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.*/

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String stringN = Integer.toString(n);
        for(int i = 0; i < stringN.length(); i++) {
            answer += (stringN.charAt(i) - '0');
        }
        
        return answer;
    }
}