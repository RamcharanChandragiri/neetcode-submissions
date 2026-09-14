class Solution {
    public int missingNumber(int[] nums) {
       int n= nums.length;
       int sum=0;
       int orgsum=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
       } 
       orgsum=(n*(n+1))/2;
        return orgsum-sum;
    }
}
