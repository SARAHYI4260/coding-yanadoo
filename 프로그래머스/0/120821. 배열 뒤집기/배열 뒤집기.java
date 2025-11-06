class Solution {
    public int[] solution(int[] num_list) {
         // 결과를 담을 새로운 배열 생성 (원본과 같은 길이)
        int[] answer = new int[num_list.length];
        
         // 원본 배열을 처음부터 끝까지 순회
        for (int i = 0; i < num_list.length; i++) {
            // answer[0]에는 num_list의 마지막 원소를
            // answer[1]에는 num_list의 마지막-1 원소를
            // answer[2]에는 num_list의 마지막-2 원소를... 넣음
            answer[i] = num_list[num_list.length - 1 - i];
        }
        
        return answer;
    }
}