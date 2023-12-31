class Solution {
    public int solution(int hp) {
        int ftime = hp/5;
        int stime = (hp%5)/3;
        int last = (hp%5)%3;
        
        int answer = ftime+stime+last;
        return answer;
    }
}