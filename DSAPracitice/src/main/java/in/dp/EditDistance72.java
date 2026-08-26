package in.dp;

public class EditDistance72 {
    public int minDistance(String word1, String word2) {
        Integer[][] dp = new Integer[word1.length()+1][word2.length()+1];
        return minE(word1,word2, 0, 0, dp);
    }
    public int minE(String word1, String word2, int i, int j, Integer[][] dp){
        if (i == word1.length()) return (word2.length() - j);
        if (j == word2.length()) return (word1.length() - i);
        if(dp[i][j]!=null) return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)) return minE(word1, word2, i+1, j+1, dp);
        int delete = minE(word1, word2, i + 1, j, dp);
        int insert = minE(word1, word2, i, j + 1, dp);
        int replace = minE(word1, word2, i + 1, j + 1, dp);

        return dp[i][j]=1 + Math.min(delete, Math.min(insert, replace));
    }
}
