class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        String temp = Integer.toBinaryString(n);
        
        for(int i=0; i<temp.length(); i++){
            if(temp.charAt(i)=='1'){
                count++;
            }
        }
        for(int i=n+1; i<1000000; i++){
            int index = 0;
            String a = Integer.toBinaryString(i);
            for(int j=0; j<a.length(); j++){
                if(a.charAt(j)=='1'){
                    index++;
                }
            }
            if(count == index){
                answer = i;
                break;
            }
        }
        return answer;
    }
}