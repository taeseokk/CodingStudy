import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            sb.append(queue.poll()).append(" ");
            if(queue.isEmpty()){
                break;
            }
            queue.offer(queue.poll());
        }
        System.out.print(sb.toString());
        
    }
}