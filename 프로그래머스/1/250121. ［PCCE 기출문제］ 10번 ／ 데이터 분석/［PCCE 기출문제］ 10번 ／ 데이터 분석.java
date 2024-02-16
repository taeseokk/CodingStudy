import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();
        int type=0;
        if(ext.equals("code")){
            type = 0;
        }else if(ext.equals("date")){
            type = 1;
        }else if(ext.equals("maximum")){
            type = 2;
        }else if(ext.equals("remain")){
            type = 3;
        }
        
        for(int i=0; i<data.length;i++){
            if(data[i][type]<val_ext){
                list.add(data[i]);
            }
        }
        
        int[][] answer = new int[list.size()][4];
        
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        final int sort;
        if(sort_by.equals("code")){
            sort = 0;
        }else if(sort_by.equals("date")){
            sort = 1;
        }else if(sort_by.equals("maximum")){
            sort = 2;
        }else if(sort_by.equals("remain")){
            sort = 3;
        }else{
            sort=0;
        }
         Arrays.sort(answer, Comparator.comparingInt(arr -> arr[sort]));
        return answer;
    }
}