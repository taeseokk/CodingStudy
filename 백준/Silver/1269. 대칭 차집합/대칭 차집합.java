import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        
        for(int i=0; i<a; i++){
            int n = sc.nextInt();
            setA.add(n);
        }
        for(int i=0; i<b; i++){
            int n = sc.nextInt();
            setB.add(n);
        }
        int answer = 0;
        
        for(int num : setA) {
            if(!setB.contains(num)) {
                answer += 1;
            }
        }
        for(int num : setB) {
            if(!setA.contains(num)) {
                answer += 1;
            }
        }
        System.out.print(answer);
    }
}