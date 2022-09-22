class Solution {
    public void dfs(List<Integer> list, int n, int k, int i){
        if(n==0){
           list.add(i);
            return;
        }
        if(i==0){
            for(int a=1;a<10;a++){
                dfs(list, n-1, k, a);
            }
        }
        else{
            int prev=i%10;
            if(prev+k>=0&&prev+k<=9){
                dfs(list, n-1, k, i*10+k+prev);
            }
            if(prev-k>=0&&prev-k<=9&&k!=0){
            dfs(list, n-1, k, i*10-k+prev);
        }
    }
    }
    public int[] numsSameConsecDiff(int n, int k) {
        List <Integer> res= new ArrayList<>();
            dfs(res, n, k, 0);
        int[] ans= new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}