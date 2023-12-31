class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseLetter = letter.split(" ");
        String answer = "";
        for(String word : morseLetter){
            for(int i=0; i<morse.length;i++){
                if(word.equals(morse[i])){
                    answer+=(Character.toString(i+'a'));
                }
                
            }
        }
        
        return answer;
    }
}