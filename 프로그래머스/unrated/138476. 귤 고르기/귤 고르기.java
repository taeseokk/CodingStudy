import java.util.*;
import java.util.Map.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        // 귤 사이즈별로 정리
        for(int size : tangerine){
            map.put(size, map.getOrDefault(size,0)+1);
        }
        //size별 리스트
        List<Integer> list = new ArrayList<>(map.keySet());
        
        // list에서 value 기준 내림차순 정렬-> 사이즈별 총개수 내림차순 list
        list.sort((o1,o2) -> map.get(o2) - map.get(o1));
        
        // k 개수만큼 상자에 담으며 최소값 출력
        int i=0;
        while(k>0){
            k-=map.get(list.get(i));
            answer++;
            i++;
        }
        return answer;
    }
}