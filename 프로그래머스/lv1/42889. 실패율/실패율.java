import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] fail = new double[N];  //실패율
        int[] check = new int[N];       //스테이지에 있는 인원 수
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    check[i]++;
                }
            }
        }
        int index = stages.length; //총인원
        for(int i=0; i<check.length; i++){
            int numerator = check[i];
            if (index == 0) {
                fail[i] = 0;
            } else {
                fail[i] = (double) numerator / index;
            }
            index -= check[i];
        }
         double max = 0;
        int target = 1;
        for (int i = 0; i < fail.length; i++) {
            max = fail[0];
            target = 1;
            for (int j = 0; j < fail.length; j++) {
                if (fail[j] > max) {
                    max = fail[j];
                    target = j + 1;
                }
            }
            fail[target - 1] = -1;
            answer[i] = target;
        }
        
        return answer;
    }
}