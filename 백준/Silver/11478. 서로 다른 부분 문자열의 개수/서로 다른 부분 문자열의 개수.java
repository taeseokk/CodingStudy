import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String str = sc.next();
        
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length()+1; j++){
                String s = str.substring(i,j);
                
                set.add(s);
            }
        }
        System.out.print(set.size());
    }
}