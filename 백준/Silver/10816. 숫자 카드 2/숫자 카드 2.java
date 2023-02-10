import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
    	StringBuffer sb = new StringBuffer();

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int key = sc.nextInt();
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                map.put(key, map.get(key)+1);
            }
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            int num = sc.nextInt();
        
        if(map.containsKey(num)){
            sb.append(map.get(num) +" ");
        }
            else{
                sb.append(0 + " ");
            }
        }
        System.out.println(sb);
    }
}