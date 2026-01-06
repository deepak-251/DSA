class Solution {
    public String largestOddNumber(String num) {
        // Approch -> check odd from last -> if found return substring till that index
        if(num.length()==0){
            return "";
        }

        //"12340"
        for (int i = num.length()-1 ; i >= 0 ; i--) {
            int digit = num.charAt(i) - '0';  //converting char into digit , '0' -> 48 ascii
            if (digit % 2 != 0) {
                return num.substring(0,i+1);
            }
        }

        return "";

    }
}