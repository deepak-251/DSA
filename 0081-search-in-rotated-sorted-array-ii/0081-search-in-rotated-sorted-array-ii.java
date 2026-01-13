class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums); // sorting array

        // applying binary serch
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>nums[mid]){
                start = mid+1;
            }else if(target<nums[mid]){
                end = mid-1;
            }else{
                return true; //found
            }
        }
        return false; //not found
    }
}