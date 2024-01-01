class Solution {
    public int solution(String s) {
        char c = s.charAt(0);
        int idx = 0;
        int jdx = 0;
        int answer = 0;
        for(int i=0; i<s.length();i++){
            if(idx==jdx){
                answer++;
                c = s.charAt(i);
            }
            if(s.charAt(i)==c){
                idx++;
            }else{
                jdx++;
            }
        }
        return answer;
    }
}