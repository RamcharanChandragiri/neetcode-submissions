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
    void in(TreeNode root,ArrayList arrl){
        if(root==null) return ;
        in(root.left,arrl);
        arrl.add(root.val);
        in(root.right,arrl);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arrl = new ArrayList<>();
        in(root,arrl);
        return arrl;
    }
}