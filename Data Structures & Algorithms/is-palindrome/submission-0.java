class Solution {
    public boolean isPalindrome(String s) {
        String clean="";
        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch)){
                clean=clean+ch;
            }
        }
        for(int i=0;i<=clean.length()-1;i++){
            if(clean.charAt(i)!=clean.charAt(clean.length()-1-i)){
                return false;
                
            }
        }
        return true;
        
    }
}
