import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 동전의 종류
        int k = Integer.parseInt(st.nextToken()); // 동전을 사용한 가치의 합
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for(int i=n-1; i>=0; i--){
            if(k>=arr[i]){
                count +=k/arr[i];
                k = k%arr[i];
            }
        }
        System.out.println(count);
        
    }
}