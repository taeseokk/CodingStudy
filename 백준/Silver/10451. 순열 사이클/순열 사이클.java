import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            arr = new int[n+1];
            visited = new boolean[n+1];
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<n+1; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int q=1; q<n+1; q++){
                if(!visited[q]){
                    dfs(q);
                    count++;
                }
            }
            sb.append(count).append("\n");

        }
        System.out.println(sb);


    }

    static void dfs(int start){
        visited[start] = true;
        int index = arr[start];
        if(!visited[index]){
            dfs(index);
        }
    }
}