class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //step 1: count num of 0,1,2 and add to map

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        //step 2: overwrite array
        int j = 0;
        for(int i = 0; i < 3; i++){
            while(map.getOrDefault(i,0) > 0){
                nums[j] = i;
                map.put(i, map.getOrDefault(i,0) - 1);
                j+= 1;
            }
        }
    }
}