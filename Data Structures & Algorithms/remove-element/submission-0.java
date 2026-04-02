
class Solution {
    public int removeElement(int[] nums, int val) {
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                list.add(nums[i]);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}