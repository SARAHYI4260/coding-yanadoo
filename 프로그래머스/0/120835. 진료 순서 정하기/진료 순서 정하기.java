class Solution {
    public int[] solution(int[] emergency) {
        // 1. answer의 길이는 10이 아니라 환자 수만큼
        int[] answer = new int[emergency.length];
        
        // 2. 원본을 보존하기 위해 복사본
        int[] copy = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++) {
            copy[i] = emergency[i];
        }

        // 3. 내림차순으로 정렬
        for(int i = 0; i < copy.length - 1; i++) {
            int maxIndex = i;
            for(int j = i + 1; j < copy.length; j++) {
                if (copy[j] > copy[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = copy[maxIndex];
            copy[maxIndex] = copy[i];
            copy[i] = temp;
        }

        // 4. 이제 순위를 매기기.
        // 원본 emergency의 숫자가 정렬된 copy의 몇 번째에 있는지 찾기
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < copy.length; j++) {
                if(emergency[i] == copy[j]) {
                    answer[i] = j + 1; // 인덱스는 0부터 시작, 순위는 +1
                    break; 
                }
            }
        }
        
        return answer;
    }
}