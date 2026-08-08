class Solution {
    String modify(String s) {
        if(Character.isUpperCase(s.charAt(0)))
        return s.toUpperCase();
        else 
        return s.toLowerCase();

      
    }
}