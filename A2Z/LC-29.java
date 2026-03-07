class Solution {
    public int divide(int dividend, int divisor) {
        
        // Edge case
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        
        // Determine sign
        boolean negative = (dividend < 0) ^ (divisor < 0);
        
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        
        int quotient = 0;
        
        // Bit shifting approach
        for(int i = 31; i >= 0; i--) {
            if((n >> i) >= d) {
                quotient += (1 << i);
                n -= (d << i);
            }
        }
        
        return negative ? -quotient : quotient;
    }
}