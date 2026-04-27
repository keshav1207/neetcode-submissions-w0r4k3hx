class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let res = new Map();
        // We need to go through all the strs, count the frequencies of each letter
        // then we look at map where  the key are frequencies and letters,  append if present otherwise add it
        for(let str of strs){
            const count = new Array(26).fill(0);
            for(let c of str){
                count[c.charCodeAt(0) - 'a'.charCodeAt(0)] += 1;
            }
            const key = count.join(',');
            if(!res.has(key)){
                res.set(key,[]);
            }

            res.get(key).push(str);
        }
        
        


        return Array.from(res.values());
    }
}
