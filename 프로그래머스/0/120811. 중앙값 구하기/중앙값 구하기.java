class Solution {
    public int solution(int[] array) {
        // 1. 정답을 담을 변수 초기화
        int answer = 0;
        
        // 2. 버블 정렬(Bubble Sort) 시작
        // 바깥쪽 for문: 배열의 크기만큼 반복하여 모든 숫자가 제 자리를 찾게 함
        for (int i = 0; i < array.length - 1; i++) {
            
            // 안쪽 for문: 인접한 두 숫자를 비교하며 큰 숫자를 뒤로 밀어냄
            // j < array.length - 1 인 이유는 j+1(옆집)을 확인해야 하기 때문!
            for (int j = 0; j < array.length - 1; j++) {
                
                // 만약 왼쪽 숫자(j)가 오른쪽 숫자(j+1)보다 크다면?
                if (array[j] > array[j + 1]) {
                    // [자리를 바꾸는 로직 - Swap]
                    int temp = array[j];      // 1) 왼쪽 숫자를 임시 컵(temp)에 보관
                    array[j] = array[j + 1];  // 2) 오른쪽 숫자를 왼쪽 방으로 옮김
                    array[j + 1] = temp;      // 3) 임시 컵에 있던 숫자를 오른쪽 방으로 옮김
                }
                // 크지 않다면 아무 일도 하지 않고 다음 칸(j+1)으로 이동함
            }
        }
        
        // 3. 중앙값 찾기
        // 정렬이 완료된 배열에서 정가운데 인덱스를 계산 (예: 5/2 = 2번 인덱스)
        int middleIndex = array.length / 2;
        
        // 4. 중앙에 위치한 값을 answer에 대입
        answer = array[middleIndex];
        
        return answer;
    }
}