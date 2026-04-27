class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let unique = new Set ();
        for(let i= 0; i < nums.length; i ++){
            if(unique.has(nums[i])){
                return true;
            }
            else{
                unique.add(nums[i]);
            }
        }

        return false;
    }
}
