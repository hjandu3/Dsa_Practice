public class LongestCommonSubstring {
//    Input : s1 = “GeeksforGeeks”, s2 = “GeeksQuiz”
//    Output : 5

    public Integer longestSubStrong(String s1,String s2){
        int s1Length = s1.length();
        int s2Length = s2.length();
        int maxLength = 0;
        if(s1Length>=s2Length){
            maxLength = s1Length;
        }
        int prev[] = new int[s1Length+1];
        int res =0;
        for(int i=1;i<=s1Length;i++){
            int curr[] = new int[maxLength+1];
            for(int j=1;j<=s2Length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    curr[j]= prev[j-1]+1;
                    res= Math.max(res,curr[j]);
                }else{
                    curr[i]=0;
                }
            }
            prev = curr;
        }
        return res;
    }
}
