class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int[] p = new int[nums.length/2];
        int[] n = new int[nums.length/2];
        int j=0;
        int k = 0;

        //[3,1,-2,-5,2,-4]
        for(int i=0 ; i<nums.length;i++){
            if(nums[i]>0){
              p[j] = nums[i];
              j++;  
            }else if(nums[i]<0){
                n[k]=nums[i];
                k++;
            }
        }
        j =0;
        k =0;
        for(int i= 0 ; i<nums.length ; i++){
            if(i%2==0){
                arr[i]=p[j];
                j++;
            }else if(i%2!=0){
                arr[i]=n[k];
                k++;
            }
        }
        return arr;
    }
}