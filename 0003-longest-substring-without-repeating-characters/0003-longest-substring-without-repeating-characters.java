class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128]; 
    
        Arrays.fill(charIndex, -1);   
        int start = 0; 
        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
        
            if (charIndex[currentChar] >= start) {
                start = charIndex[currentChar] + 1;
            }
            maxLength = Math.max(maxLength, end - start + 1);
            charIndex[currentChar] = end;
        } 
        return maxLength;
    }
}