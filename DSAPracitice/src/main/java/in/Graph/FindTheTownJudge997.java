package in.Graph;

import java.util.Arrays;

class FindTheTownJudge997 {
    public int findJudge(int n, int[][] trust) {
        int[] trustsOthers = new int[n+1];
        int[] trustedByOthers = new int[n+1];
        for(int[] ele: trust){
            trustsOthers[ele[0]]++;
            trustedByOthers[ele[1]]++;
        }
        for(int i=1;i<n+1;i++){
            if(trustsOthers[i]==0 && trustedByOthers[i]==n-1) return i;
        }
        return -1;

    }
     public int findJudgeR(int n, int[][] trust) {
         int[] trustsOthers = new int[n+1];
         int[] othersTrust = new int[n+1];
         Arrays.fill(trustsOthers, 0);
         Arrays.fill(othersTrust, 0);
         for(int i=0;i<trust.length;i++){
             trustsOthers[trust[i][0]]++;
             othersTrust[trust[i][1]]++;
         }
         for(int i=1;i<=n;i++){
             if(trustsOthers[i]==0 && othersTrust[i]==n-1) return i;
         }
         return -1;

     }
 }
