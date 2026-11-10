class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void fun(int[] arr,int target,int idx,ArrayList<Integer> al){
        if(idx>=arr.length) return;
        if(target<0) return;
        if(target==0){
            ans.add(new ArrayList<>(al));
            return;
        }
        al.add(arr[idx]);
        fun(arr,target-arr[idx],idx,al);
        al.remove(al.size()-1);
        fun(arr,target,idx+1,al);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        fun(nums,target,0,new ArrayList<>());
        return ans;
    }
}
