import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[] arr = {0,0};
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<dirs.length(); i++){
            char str = dirs.charAt(i);
            int x = arr[0];
            int y = arr[1];
            if(str=='U'&&arr[1]<5){
                arr[1]++;
            }
            else if(str=='D'&& arr[1]>-5){
                arr[1]--;
            }
            else if(str=='R' && arr[0]<5){
                arr[0]++;
            }
            else if(str=='L'&& arr[0]>-5){
                arr[0]--;
            }
            else{
                continue;
            }
            
            
            String check = String.valueOf(arr[0]);
            check += String.valueOf(arr[1]);
            String xy = String.valueOf(x);
            xy += String.valueOf(y);
            
            String checkXY = check+xy;
            String XYcheck = xy+check;
            
            if(!list.contains(checkXY)&& !list.contains(XYcheck)&& !XYcheck.equals(checkXY)){
                list.add(XYcheck);
                list.add(checkXY);
            }
           
            answer = list.size()/2;
        }
        
        return answer;
    }
}


