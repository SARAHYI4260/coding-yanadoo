class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int resultDenom = denom1 * denom2;
        int resultNumer = (numer1 * denom2) + (numer2 * denom1);
        
        int gcd = 1;
        
        for (int i =1; i<=resultNumer && i <= resultDenom; i++){
            if(resultNumer % i == 0 && resultDenom % i == 0){
                gcd = i;
            }
        }
        int[] answer = {resultNumer / gcd, resultDenom / gcd};
        return answer;
    }
}