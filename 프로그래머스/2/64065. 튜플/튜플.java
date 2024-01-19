import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public int[] solution(String s) {
    	
        ArrayList<Integer> list = new ArrayList<>();
        String[] splitS = s.split("\\},\\{");     
        // ["2", "2,1", "2,1,3", "2,1,3,4"] -> [2, 1, 3, 4]
        // ["3", "2,3", "4,2,3", "2,3,4,1"] -> [3, 2, 4, 1]
        
         // 배열의 가장 앞, 뒷 문자열에서 '{' , '}' 문자 제거
        splitS[0] = splitS[0].replaceAll("[{}]","");
        splitS[splitS.length-1] = splitS[splitS.length-1].replaceAll("[{}]","");

        String[][] strArr = new String[splitS.length][];
        for(int i=0; i<splitS.length; i++){
            String[] value = splitS[i].split(",");
            strArr[value.length-1] = value;
        }
        HashSet<String> result = new HashSet<>();
        String[] check = new String[strArr.length];
        for(int i=0; i<strArr.length; i++){
            for(int j=0; j<strArr[i].length; j++){
                if(!result.contains(strArr[i][j])){
                    result.add(strArr[i][j]);
                    check[i] = strArr[i][j];
                }
                
            }
        }        
        int[] answer = new int[check.length];
        for (int i = 0; i < check.length ; i++) {
            answer[i] = Integer.parseInt(check[i]);
        }
        return answer;
    }
}
