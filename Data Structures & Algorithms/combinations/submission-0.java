class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void function(int arr[],int idx,ArrayList<Integer> al,int k){
        if(al.size()==k  ){
            ans.add(new ArrayList<>(al));
            return ;
        }
        if(idx>=arr.length){
            return;
        }
        al.add(arr[idx]);
        function(arr,idx+1,al,k);
        al.remove(al.size()-1);
        function(arr,idx+1,al,k);
        
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        ArrayList<Integer> al= new ArrayList<>();
        function(nums,0,al,k);
        return ans;

    }
}