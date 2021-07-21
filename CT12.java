/*최대공약수와 최소공배수
문제 설명
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
*/

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        answer = new int[2];
        if(n <= m) {
            for(int i = 1; i < n + 1; i++) {
                if(n % i == 0 && m %i == 0) {
                    answer[0] = i;
                    answer[1] =  n * m / i;
                }
            }
        } else {
            for(int i = 1; i < m + 1; i++) {
                if(n % i == 0 && m %i == 0) {
                    answer[0] = i;
                    answer[1] =  n * m / i;
                }
            }
        }
        return answer;
    }
}