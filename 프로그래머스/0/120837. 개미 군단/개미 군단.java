class Solution {
    public int solution(int hp) {
        int answer = 0;
        int major = 5, soldier = 3, worker = 1;
        int num1 = 0, num2 = 0, num3 =0;
        int rest1 = 0, rest2 = 0;
        
        num1 = hp / major;
        rest1 = hp % major;
        num2 = rest1 / soldier;
        rest2 = rest1 % soldier;
        num3 = rest2 / worker;
        
        answer = num1 + num2 + num3;
        
        return answer;
    }
}