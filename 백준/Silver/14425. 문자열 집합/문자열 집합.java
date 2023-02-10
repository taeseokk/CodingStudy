import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            String s = sc.next();
            set.add(s);
        }
        for(int i=0; i<m; i++){
            String s = sc.next();
            if(set.contains(s)){
                count++;
            }
        }
        System.out.print(count);
    }
}