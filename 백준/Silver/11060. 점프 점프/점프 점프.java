import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n;
    static int[] arr;
    static boolean[] visited;

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int answer = 0;
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        answer = bfs();
        System.out.println(answer);


    }

    static int bfs(){
        Queue<node> que = new LinkedList<>();
        visited[0] = true;
        que.add(new node(0,0));
        while(!que.isEmpty()){
            node cur = que.poll();
            if(cur.index==n-1){
                return cur.count;
            }
            for(int i=1; i<=arr[cur.index]; i++){
                int num = cur.index+i;
                if(num<n && !visited[num]) {
                    visited[num] = true;
                    que.add(new node(num, cur.count + 1));
                }
            }
        }
        return -1;
    }

    static class node{
        int index;
        int count;
        public node(int index, int count){
            this.index = index;
            this.count = count;
        }

    }
}