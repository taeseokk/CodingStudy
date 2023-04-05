class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int k=0;
        int index1=0;
        int index2=0;
        while(k<goal.length){
            if(index1<cards1.length&&goal[k].equals(cards1[index1])){
                index1++;
            } else if(index2<cards2.length&&goal[k].equals(cards2[index2])){
                index2++;
            } else{
                answer = "No";
                break;
            }
            k++;
        }
        return answer;
    }
}