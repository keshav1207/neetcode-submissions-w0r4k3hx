class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        cars = []

        for i in range(len(position)):
            cars.append((position[i],(target - position[i])/speed[i]))
        
        cars.sort(reverse=True)

        numFleets = 0
        maxTime = 0

        for p,t in cars:
            if t > maxTime:
                numFleets += 1
                maxTime = t
            
                
        
        return numFleets
            
            
