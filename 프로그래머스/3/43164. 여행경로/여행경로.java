import java.util.*;
class Solution {
    static boolean[] visited;
    static ArrayList<String> list = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        dfs(tickets,"ICN",0,"ICN");
        Collections.sort(list);
        return list.get(0).split(" ");
    }
    public static void dfs(String[][] tickets,String nowCity, int cnt, String cityList){
        if(cnt==tickets.length){
            list.add(cityList);
            return;
        }
        
        for(int i=0; i<tickets.length; i++){
            if(!visited[i]&&nowCity.equals(tickets[i][0])){
            visited[i] = true;
                dfs(tickets,tickets[i][1],cnt+1,cityList+" "+tickets[i][1]);
                visited[i]=false;
           }
        }
    }
}