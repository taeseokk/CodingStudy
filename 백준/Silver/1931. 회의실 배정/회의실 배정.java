import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] time = new int[n][2];
        /*
        time[][0] = 시작시점
        time[][1] = 종료시점
        */
        
        for(int i=0; i<n; i++){
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }
        Arrays.sort(time, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬  
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
			}
 
		});
        int cnt = 0;
        int end = 0;
        
        for(int i=0; i<n; i++){
            if(end <= time[i][0]){
                end = time[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}