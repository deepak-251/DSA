class Solution {
    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            int sIndex = s.indexOf(s.charAt(i));   //.indexof() always return first occurance
            int tIndex = t.indexOf(t.charAt(i));

            // patterns should match
            if (sIndex != tIndex) {
                return false;
            }
        }
        return true;
    }
}