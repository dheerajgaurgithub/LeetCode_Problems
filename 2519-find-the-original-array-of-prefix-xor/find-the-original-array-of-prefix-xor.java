class Solution {
    public int[] findArray(int[] pref) {
        int[]answer=new int[pref.length];
        answer[0]=pref[0];
        for(int i=0;i<answer.length-1;i++){
            answer[i+1]=pref[i]^pref[i+1];
        }
        return answer;
    }
}