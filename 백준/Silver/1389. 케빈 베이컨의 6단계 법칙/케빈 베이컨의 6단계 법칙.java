import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];
        int index = 9999999;
        
        
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n; j++){
                arr[i][j] = index;
                if(i==j) arr[i][j]=0;
            }
        }
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++) {
                for (int k = 1; k <= n; k++) {
                    arr[j][k] = Math.min(arr[j][k], arr[j][i] + arr[i][k]);
                }
            }
        }
        
        int temp = 9999999;
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            int total = 0;
            for(int j=1; j<=n; j++){
                total += arr[i][j];
            }
            if(temp>total){
                temp = total;
                answer = i;
            }
        }

    System.out.println(answer);

    }
}