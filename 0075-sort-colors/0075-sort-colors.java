class Solution {
    public void sortColors(int[] nums) {
        // approch -> count 0's , 1's ,2's -> iterate and assign value
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]==0){
                zero++;
            }else if(nums[i]==1){
                one++;
            }else two++;
        }
        for(int i=0 ; i<nums.length ; i++){
            if(zero>0){
                nums[i]=0;
                zero--;
            }else if(one>0){
                nums[i]=1;
                one--;
            }else if(two>0){
                nums[i]=2;
                two--;
            }
        }
    }
}