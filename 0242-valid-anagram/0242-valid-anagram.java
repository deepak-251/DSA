class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        //converting string into array of char
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        //sorting arrays char 
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
