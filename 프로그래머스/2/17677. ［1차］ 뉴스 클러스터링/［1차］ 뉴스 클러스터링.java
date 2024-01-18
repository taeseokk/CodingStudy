import java.util.ArrayList;
class Solution {
    public int solution(String s1, String s2) {
        int answer = 0;
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();
        
        ArrayList<String> str1List = new ArrayList<>();
        ArrayList<String> str2List = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();    //합
        ArrayList<String> intersection = new ArrayList<>(); //교
        
        for(int i=0; i<str1.length()-1; i++){
            char ch1 = str1.charAt(i);
            char ch2 = str1.charAt(i+1);
             if((ch1 >= 'a' && ch1 <= 'z') && (ch2 >= 'a' && ch2 <= 'z')) {
                str1List.add(String.valueOf(ch1) + String.valueOf(ch2));
            }
        }
        for (int i = 0; i < str2.length()-1; i++) {
            char ch1 = str2.charAt(i);
            char ch2 = str2.charAt(i+1);
            if((ch1 >= 'a' && ch1 <= 'z') && (ch2 >= 'a' && ch2 <= 'z')) {
                str2List.add(String.valueOf(ch1) + String.valueOf(ch2));
            }
        }
        
        for(String s : str1List){
            if(str2List.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }
        union.addAll(str2List);
        
        double result = (double)intersection.size() / (double)union.size();
        result = result * 65536;
        if(union.size()==0){
            return 65536;
        }
        answer = (int)result;
        return answer;
    }
}