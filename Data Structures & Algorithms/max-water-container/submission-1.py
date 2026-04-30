class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxArea = 0

        i = 0
        j = len(heights) - 1

        while i < j:
            w = j - i
            h = min(heights[i], heights[j])
            a = w * h

            maxArea = max(maxArea,a)

            if heights[i] > heights[j]:
                j -= 1
            else:
                i += 1
        

        return maxArea