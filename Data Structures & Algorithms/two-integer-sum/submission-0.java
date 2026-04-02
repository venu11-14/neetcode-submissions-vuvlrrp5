class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        int s = 0; 
        int e = nums.length-1;
        while(s<e){
            int sum = nums[s]+nums[e];
            if(sum == target){
                temp[0] = s;
                temp[1] = e;
                break;
            }
            if(sum<target){
                s++;
            }else{
                e--;
            }
        }
        return temp;
    }
}
