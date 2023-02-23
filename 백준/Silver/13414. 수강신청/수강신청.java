import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> set = new LinkedHashSet<>();  
        int k = sc.nextInt();
        int l = sc.nextInt();
        int count = 0;
        for(int i=0; i<l; i++){
            String a = sc.next();
            if(set.contains(a)) set.remove(a);
                set.add(a);
    }
            for(String x:set){
                count++;
                System.out.println(x);
            if(count == k) break;
            }
        }
    }
