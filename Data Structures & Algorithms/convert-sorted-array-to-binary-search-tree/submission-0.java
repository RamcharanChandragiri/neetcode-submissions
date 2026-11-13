class Solution {
    TreeNode fun(int start,int end,int[] arr){
        if(start<=end){
            int mid = start+(end-start)/2;
            TreeNode nn= new TreeNode(arr[mid]);
            nn.left=fun(start,mid-1,arr);
            nn.right=fun(mid+1,end,arr);
            return nn;
        }
        return null;
     }
    public TreeNode sortedArrayToBST(int[] nums) {
        int start=0;
        int end=nums.length-1;
        return fun(start,end,nums);
    }
}
