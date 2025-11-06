class Solution {
    public String solution(String my_string) {
        // 빈 문자열로 시작 (여기에 뒤집은 결과를 차곡차곡 쌓을 거예요)
         String answer = "";
        
        // 문자열을 뒤에서부터 앞으로 순회
        // i는 마지막 인덱스(길이-1)부터 시작해서 0까지 감소
        for (int i = my_string.length()-1; i>=0; i--){
            // str의 i번째 문자를 하나씩 꺼내서 answer 뒤에 붙이기
            answer += my_string.charAt(i);
        }
          // 뒤집힌 문자열 반환
        return answer;
    }
}