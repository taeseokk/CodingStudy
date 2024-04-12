class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int maxTime = -1;
        m = change(m);
        for(int i=0; i<musicinfos.length; i++){
            String[] temp = musicinfos[i].split(",");
            
            String[] time = temp[0].split(":");
            
            int start = Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]);
            
            time = temp[1].split(":");
            int end = Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]);
            
            int play = end-start;
            
            temp[3] = change(temp[3]);
            
            String melody = temp[3];
            
            // 플레이 시간이 악보 길이보다 작은 경우
            if(play <=temp[3].length()){
                melody = melody.substring(0,play);
            }
            else{ // 악보길이보다 플레이 시간이 긴 경우
                
                for(int j=0; j<play/temp[3].length(); j++){
                    melody+=temp[3];
                }
                melody += temp[3].substring(0, play % temp[3].length());
            }
            if(melody.contains(m) && play>maxTime){
                maxTime = play;
                answer = temp[2];
            }
        }
        
        return answer;
    }
    
    String change(String melody){
        melody = melody.replace("C#","c");
        melody = melody.replace("D#","d");
        melody = melody.replace("F#","f");
        melody = melody.replace("G#","g");
        melody = melody.replace("A#","a");
        return melody;
    }
}