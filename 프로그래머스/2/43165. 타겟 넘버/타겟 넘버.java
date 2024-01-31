class Solution {
    int[] numbers;
    int target;
    int answer;
    public int solution(int[] numbers, int target) {
        answer=0;
        this.numbers=numbers;
        this.target=target;
        dfs(0,0);
        return answer;
    }
    
     void dfs(int index, int sum){
        
        //1 탈출 조건
        if(index==numbers.length){
            if(sum==target) answer++;
            return;
        }
        
        
        //2 수행동작
        dfs(index +1, sum+numbers[index]);
        dfs(index +1, sum-numbers[index]);
    }
}