class Solution:
    def isValid(self, s: str) -> bool:
        opening = ['(','{','[']
        closing = [')','}',']']
        stack = []

        for n in s:
            #if opening
            if n in opening:
                stack.append(n)


            #if closing
            if n in closing:
                ind = closing.index(n)
                if  stack and  stack[-1] == opening[ind]:
                    stack.pop()
                else:
                    return False
        

        return len(stack) == 0