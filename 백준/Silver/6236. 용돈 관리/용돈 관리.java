import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // n일
        int m = Integer.parseInt(st.nextToken());   // 통장에서 돈을 빼는 횟수

        int[] arr = new int[n];

        int left = 0;
        int right = 0;
        int max = 0;
        int result = 0;

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            right += arr[i];
            max = Math.max(max,arr[i]);
        }

        left = max;

        
        while(left<=right){
            int mid = (left+right)/2;
            
            if(m>=getMid(mid,arr)){
                result = mid;
                right = mid -1;
            }else{
                left = mid+1;
            }
        }
        
        System.out.println(result);
    }
    
    static int getMid(int index, int[] arr){
        int count = 1;
        int money = index;
        
        for(int n : arr){
            money -= n;
            
            if(money < 0){
                count++;
                money = index - n;
            }
        }
        return count;
    }
}