class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        frequency = {}
        res = []
        # Count frequencies of each number
        for n in nums:
            count[n] = count.get(n,0) + 1

        # Create frequency hashmap -  key = frequency , value = array of numbers
        for i in range(len(nums)):
            frequency[i+1] = []
        
        for num,freq in count.items():
            frequency[freq].append(num)
       

       # Append from top frequency to lower
        j = k
        
        for freq in range(len(nums),0,-1):
            for num in frequency[freq]:
                res.append(num)
                j -= 1
                if(j == 0):
                    return res
            

        return res
