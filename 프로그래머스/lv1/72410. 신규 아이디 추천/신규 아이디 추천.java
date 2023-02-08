class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();   //1단계
        
        answer = answer.replaceAll("[^-_.a-z0-9]","");  //2단계
        answer = answer.replaceAll("[.]{2,}",".");        //3단계
        answer = answer.replaceAll("^[.]|[.]$","");      //4단계
        
        if(answer.equals("")){  //5단계
            answer +="a";
        }
        if(answer.length() >=16){
        answer = answer.substring(0,15);    //6단계
        answer = answer.replaceAll("[.]$","");  
        }
            
        if(answer.length() <=2){
            while(answer.length() <3){
                answer += answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }
}

//소문자 -32 = 대문자