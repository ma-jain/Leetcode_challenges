public class unique_paths {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
       return uniquePathsUtil(m, n, dp);

   }
    private static int uniquePathsUtil(int m, int n, int[][] dp) {
       if(m == 1 || n == 1) return 1;
       if(dp[m][n] != 0)
           return dp[m][n];
       return dp[m][n] = uniquePathsUtil(m-1, n, dp) + uniquePathsUtil(m, n-1, dp);
   }
public static void main(String[] args){
int m=3, n=7;
unique_paths obj = new unique_paths();
int ans =obj.uniquePaths(m, n);
System.out.println(ans);

}
}
