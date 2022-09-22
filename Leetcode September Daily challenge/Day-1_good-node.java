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
    public int dfs(TreeNode root, int max){
        if(root==null) return  0;
        int amount=0;
        if(root.val>=max){
            max=root.val;
            amount++;
        }
        amount+=dfs(root.left, max);
        amount+=dfs(root.right, max);

        return amount;
    }
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        int count =1;
        count+=dfs(root.right, root.val);
        count+=dfs(root.left, root.val);
        return count;

    }
}