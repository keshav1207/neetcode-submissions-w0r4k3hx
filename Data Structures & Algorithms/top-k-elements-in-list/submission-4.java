class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Count frequencies of each
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int n: nums){
            count.put(n,count.getOrDefault(n,0)+ 1);
        }
        // Create hashmap with frequencies as key, then the group of num as values
        List<Integer>[] freq =  new List[nums.length + 1];

        for(int i = 0; i < freq.length; i ++){
                freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry: count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        // Iterate from highest freq to lowest and getting the num
        int[]res = new int[k];
        int index = 0;

        for(int i = freq.length -1; i > 0 && index < k; i--){
            for(int n: freq[i]){
                res[index++] = n;
                if(index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
