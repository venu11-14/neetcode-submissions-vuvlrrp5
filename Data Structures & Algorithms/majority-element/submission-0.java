class Solution {
    public int majorityElement(int[] nums) {
        int x = nums.length/2;
        int resmax = 0, c = 0;
        for(int i=0; i<nums.length; i++){
            int max =  Integer.MIN_VALUE;
            for(int j=0; j<nums.length; j++){
                if(nums[j]>max){
                    resmax = nums[i];
                }
            }
            for(int k=0; k<nums.length; k++){
                if(nums[k]==resmax){
                    c++;
                }
            }
        }
        return resmax;
    }
}