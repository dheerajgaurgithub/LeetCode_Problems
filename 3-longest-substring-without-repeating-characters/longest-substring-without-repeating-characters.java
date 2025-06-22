class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        int[] gf=new int[128];
        for(int i=0, j=0;j<n;j++){
            i=Math.max(gf[s.charAt(j)],i);
            ans=Math.max(ans,j-i+1);
            gf[s.charAt(j)]=j+1;
        }
        return ans;
    }
}