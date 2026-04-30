import java.util.*;

class Solution {
    public String solution(String letter) {
        HashMap<String, String> morse = new HashMap<>();
        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        String[] morseArr = letter.split(" ");
        
        for(int i = 0; i < morseList.length; i++) {
            morse.put(morseList[i],(char)('a' + i) + "");
        }
        
        for(String s : morseArr) {
            answer += morse.get(s);
        }
        
        return answer;
    }
}