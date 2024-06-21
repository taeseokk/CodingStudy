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
        
        int six = Integer.MAX_VALUE;
        int one = Integer.MAX_VALUE;
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());
            
            if(p1<six) six = p1;
            if(p2<one) one = p2;
            
        }
        
        int answer = 0;
        while(n>=6){
            int min = Math.min(six,one*6);
            answer +=min;
            n-=6;
        }
        
        if(n>0){
            int min = Math.min(six,one*n);
            answer += min;
        }
        
        System.out.println(answer);
        
    }
}