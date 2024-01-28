import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        // 주차한 차들의 번호와 시간을 갖는 리스트
        Map<String, Integer> parking = new HashMap<>();
        // 차들의 번호와 누적된 요금을 갖는 리스트 (트리맵으로 키 (차량번호) 기준 오름차순 정렬)
        Map<String, Integer> costs = new TreeMap<>();
        
         for (String r : records) {
            String[] record = r.split(" ");
            int time = getTime(record[0]); // 출차 시간
            String carNum = record[1]; // 차량번호
            String io = record[2]; // 출입
 
            if (io.equals("IN")) {
                parking.put(carNum, time);
            }
            if (io.equals("OUT")) {
                // 한번 들어왔던 차가 아니라면
                if (!costs.containsKey(carNum)) {
                    costs.put(carNum, time - parking.get(carNum));
                } else { // 한번 입출차한 기록이있다면 기존 시간에 새 시간 누적
                    costs.put(carNum, costs.get(carNum) + time - parking.get(carNum));
                } 
                parking.remove(carNum);
            }
        }
        if (!parking.isEmpty()) {
            for (String carNum : parking.keySet()) {
                Integer cost = costs.get(carNum);
                cost = (cost == null) ? 0 : cost;
                costs.put(carNum, cost + (23 * 60 + 59) - parking.get(carNum));
            }
        }
        
        List<Integer> answer = new ArrayList<>(costs.size());
        for (Integer c : costs.values()) {
            int basicTime = fees[0];
            int basicCharge = fees[1];
            int unitTime = fees[2];
            int unitCharge = fees[3];
 
            // 요금 = 기본요금 + ((min-기본시간) / 단위시간) * 단위요금
            if (c <= basicTime) {
                answer.add(basicCharge) ;
            } else {
                answer.add((int) (basicCharge + Math.ceil((double) (c - basicTime) / unitTime) * unitCharge));
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    

    //시간을 분 단위로 계산
    private static int getTime(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }
}