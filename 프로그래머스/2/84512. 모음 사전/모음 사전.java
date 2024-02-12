class Solution {
    public int solution(String word) {
        // 알파벳 모음
        String vowels = "AEIOU";
        
        // 주어진 단어가 몇 번째 단어인지 저장할 변수
        int answer = 0;
        
        // 각 자리수별로 알파벳의 인덱스를 이용하여 계산
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            int currentIdx = vowels.indexOf(currentChar);
            
            // 현재 자리수의 알파벳이면서 이전까지의 모든 경우의 수를 더해줌
            answer += currentIdx * (Math.pow(5, 5 - i) - 1) / 4 + 1;
        }
        
        return answer;
    }
}
