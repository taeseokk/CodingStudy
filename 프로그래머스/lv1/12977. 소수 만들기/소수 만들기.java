class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = 0;
                    boolean type = false;
                    sum = nums[i]+nums[j]+nums[k];
                    for(int a = 3; a<sum; a++){
                        if(sum%a==0){
                            type = true;
                            break;
                        }
                    }
                    if(type==false){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}