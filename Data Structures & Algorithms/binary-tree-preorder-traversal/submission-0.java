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
    void pre(TreeNode root,ArrayList arrl){
        if(root==null) return ;
        arrl.add(root.val);
        pre(root.left,arrl);
        pre(root.right,arrl);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arrl = new ArrayList<>();
        pre(root,arrl);
        return arrl;
    }
}