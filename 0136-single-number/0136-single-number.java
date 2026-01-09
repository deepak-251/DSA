class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        // for 1 element
        if(n==1){         
            return nums[0];
        }
        
        //check first element
        if(nums[0]!=nums[1]){      
            return nums[0];
        }

        // check last elemnt
        if(nums[n-2]!=nums[n-1]){
            return nums[n-1];
        }

        //[1,1,2,2,4]        checking middle element
        for(int i= 1 ; i<n-1 ; i++){
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]){
                return nums[i];
            }
        }
        return -1;
    }
}