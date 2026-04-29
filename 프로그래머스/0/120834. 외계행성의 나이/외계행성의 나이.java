class Solution {
    public String solution(int age) {
        String answer = "";
        String alphabet = "abcdefghij";
        String ageStr = String.valueOf(age);
        
        for(int i = 0; i < ageStr.length(); i++) {
            int index = ageStr.charAt(i) - '0';
            answer += alphabet.charAt(index);
        }
        return answer;
    }
}