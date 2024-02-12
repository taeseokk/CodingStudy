class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        if(m==1) return section.length;
        int start = section[0];
        int end = section[0]+m-1;
        
        for(int index : section){
            if(index>=start && index<=end){
                continue;
            }else{
                start = index;
                end = index+m-1;
                answer++;
            }
        }
        
        
        return answer;
    }
}