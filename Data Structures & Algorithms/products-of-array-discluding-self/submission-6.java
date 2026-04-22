class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int [] res = new int[n];
       for(int y = 0; y < nums.length; y++){
            res[y] = 1;
       }

       int prefix = 1;
       for(int i = 0; i < nums.length; i++){
            res[i] = prefix;
            prefix *= nums[i];
       }


        int postfix = 1;
        for(int j = nums.length - 1; j >= 0; j--){ 

                res[j] *= postfix;
                postfix *= nums[j];  
        }
        return res;
    }
    
}  
