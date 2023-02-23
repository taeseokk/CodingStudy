import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            String s = br.readLine();
            if(!map.containsKey(s)){
                map.put(s,1);
            }
            else{
                map.put(s,map.get(s)+1);
            }
        }
            for(int i=1; i<n; i++){
                String f = br.readLine();
                map.put(f,map.get(f)-1);
            }
            for(String key:map.keySet()){
                if(map.get(key)!=0){
                    System.out.println(key);
                    break;
                }
            }
        }
    }
