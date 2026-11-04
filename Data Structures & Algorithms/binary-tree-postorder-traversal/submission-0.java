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
    void post(TreeNode root,ArrayList arrl){
        if(root==null) return ;
        
        post(root.left,arrl);
        post(root.right,arrl);
        arrl.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arrl = new ArrayList<>();
        post(root,arrl);
        return arrl;
    }
}