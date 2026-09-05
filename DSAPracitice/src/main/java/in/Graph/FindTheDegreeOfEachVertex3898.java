package in.Graph;

public class FindTheDegreeOfEachVertex3898 {
    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[i] +=matrix[i][j];
            }
        }
        return ans;
    }
    public int[] findDegreesR(int[][] matrix) {
        int[] ans = new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int count=0;
            for(int j=0;j<matrix[i].length;j++){
                count+=matrix[i][j];
            }
            ans[i] = count;
        }
        return ans;
    }
}
