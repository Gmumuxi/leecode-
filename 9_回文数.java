class Solution {
    public boolean isPalindrome(int x) {
        String int2Str = Integer.toString(x);
        int intLen = int2Str.length();

        for(int i=0; i < intLen/2; i++){
            if(int2Str.charAt(i) != int2Str.charAt(intLen-1-i)) {
                return false;
            }             
        }
        return true; 
    }
}
