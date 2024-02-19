class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int life = health;          // 현재 체력
        int index= 0;               // 배열 index
        int count = 0;              // 연속 힐 성공
        int time = bandage[0];      // 시전 시간
        int recovery = bandage[1];  // 초당 회복량
        int plus = bandage[2];      // 추가 회복량
        
        for(int i=1; i<=attacks[attacks.length-1][0];i++){
            if(i !=attacks[index][0]){
                life += recovery;
                count++;
                if(count==time){
                    life += plus;
                    count=0;
                }
                if(life>health) life = health;
            }else{
                count = 0;
                life -= attacks[index][1];
                index++;
                if(life<=0) return -1;
            }
        }
        
        return life;
    }
}