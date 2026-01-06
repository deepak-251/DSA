class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        // finding smallest string
        String smallest = strs[0];
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < smallest.length()){
                smallest = strs[i];
            }
        }
        // ["flower","flow","flight"]
        for(int i = 0 ; i<smallest.length() ; i++){ 
            char ch = smallest.charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != ch){         // checking every char of smallest string in array
                    return smallest.substring(0, i);     //substring till previous index (i-1)
                }
            }
        }

        return smallest;
    }
}