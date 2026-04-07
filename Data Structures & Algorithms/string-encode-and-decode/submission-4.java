class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s: strs){
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j += 1;
            }

            //Find the length
            int length = Integer.parseInt(str.substring(i,j));

            // Extract the word
            String word = str.substring(j + 1,j + 1 + length);
            i = j + 1 + length;

            // Append
            res.add(word);
        }

        return res;
    }
}
