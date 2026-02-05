class Solution {
    public String largestOddNumber(String num) {
        
        char[] n1 = num.toCharArray();
        
        for(int i = n1.length - 1; i >= 0; i--){
            if((n1[i] - '0') % 2 != 0){   // check if digit is odd
                return num.substring(0, i + 1);
            }
        }
        
        return "";
    }
}
