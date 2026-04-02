class Solution {
    public int[] getConcatenation(int[] nums) {
        int c = 0;
        int[] temp = new int[nums.length+nums.length];
        for(int i=0; i<temp.length; i++){
            if(nums.length==i){
                c = 0;
            }
            temp[i] = nums[c++];
        }
        return temp;
    }
}