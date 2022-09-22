/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void average(TreeNode root, int i, List <Double> sum, List <Integer> count){
        if (root==null) return;
        if(i<sum.size()){
            sum.set(i, sum.get(i)+ root.val);
            count.set(i, count.get(i)+1);
        }
        else{
            sum.add(1.0*root.val);
            count.add(1);
        }
        average(root.left, i+1, sum, count);
                    average(root.right, i+1, sum, count);

        
    }
    public List<Double> averageOfLevels(TreeNode root) {
     List <Double> ans=new ArrayList<>();
             List <Integer> count=new ArrayList<>();   
        average(root, 0, ans, count);
        for(int i=0; i<ans.size(); i++){
            ans.set(i, ans.get(i)/count.get(i));
        }
return ans;
    }
}