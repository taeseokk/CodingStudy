class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        for(int i=0; i<=t.length()-len; i++){
            String text = "";
            for(int j=i; j<i+len; j++){
                text +=t.charAt(j);
            }
            if(Long.parseLong(text)<=Long.parseLong(p)){
                answer++;
            }
        }
        
        return answer;
    }
}


