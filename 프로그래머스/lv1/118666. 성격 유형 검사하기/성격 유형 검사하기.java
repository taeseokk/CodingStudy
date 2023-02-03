class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int score_RT = 0;
        int score_CF = 0;
        int score_JM = 0;
        int score_AN = 0;
        
        for(int i=0; i<survey.length; i++){
            String sur = survey[i];
            int score = 0;
            switch(choices[i]){
                case 1: score = -3; break;
                case 2: score = -2; break;
                case 3: score = -1; break;
                case 4: score = 0; break;
                case 5: score = 1; break;
                case 6: score = 2; break;
                case 7: score = 3; break;    
            }
            switch(sur){
                case "RT" : score_RT += score; break;
                case "TR" : score_RT -= score; break;
                    
                case "CF" : score_CF += score; break;
                case "FC" : score_CF -= score; break;
                    
                case "JM" : score_JM += score; break;
                case "MJ" : score_JM -= score; break;    
                
                case "AN" : score_AN += score; break;
                case "NA" : score_AN -= score; break;    
            }
        }
        
        if(score_RT>0){
            answer+="T";
        }
        else{
            answer+="R";
        }
        if(score_CF>0){
            answer+="F";
        }
        else{
            answer+="C";
        }
        if(score_JM>0){
            answer+="M";
        }
        else{
            answer+="J";
        }
        if(score_AN>0){
            answer+="N";
        }
        else{
            answer+="A";
        }
        
        return answer;
    }
}