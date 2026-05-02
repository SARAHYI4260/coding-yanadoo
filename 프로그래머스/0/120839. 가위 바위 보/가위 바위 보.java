class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] cards = {"2", "0", "5"};
        for(int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {
                answer += cards[1] + "";
            } else if (rsp.charAt(i) == '0') {
                answer += cards[2] + "";
            } else {
                answer += cards[0] + "";
            }
        }
        return answer;
    }
}