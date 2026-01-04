class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        if(s.equals(goal)){ // if both are equal no rotation needed
            return true;
        }  
        if(s.length()!=goal.length()){ // if length is not equal directly fasle
            return false;
        }  

        //rotating string at every step and matching it with goal
        for(int i=0 ; i<s.length() ; i++){
            sb.append(sb.charAt(0));  // adding first char at last
            sb.deleteCharAt(0);  // deleting first char
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}