class Solution {
    public int[] decode(int[] encoded, int first) {
       int answer[]=new int[encoded.length+1];
       answer[0]=first;
       for(int i=0;i<answer.length-1;i++){
        answer[i+1]=answer[i]^encoded[i];
       } 
       return answer;
    }
}