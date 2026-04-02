class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int oc = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    oc+=1;
                }
            }
            if(oc>1){
                return true;
            }
        }
        return false;
    }
}