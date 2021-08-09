/*문자열을 정수로 바꾸기

문제 설명
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.*/

class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.startsWith("-")) {
            String newS = s.substring(1, s.length());
            answer = Integer.parseInt(newS) * -1;
        } else {
            answer = Integer.parseInt(s);    
        }
        
        return answer;
    }
}