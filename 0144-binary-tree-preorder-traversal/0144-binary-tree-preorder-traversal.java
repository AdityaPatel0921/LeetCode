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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans  =  new ArrayList<>();
        helperFunctionToPrint(root,  ans);
        return ans;
    }
    private static  void   helperFunctionToPrint(TreeNode node , List<Integer>   val){
        if(node == null) return ;
            val.add(node .val);
             helperFunctionToPrint(node.left, val );
              helperFunctionToPrint(node.right, val);

    }
}