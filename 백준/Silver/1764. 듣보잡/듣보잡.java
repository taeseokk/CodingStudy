import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++){
            String s = sc.next();
            set.add(s);
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<m; i++){
            String s = sc.next();
            if(set.contains(s)){
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}