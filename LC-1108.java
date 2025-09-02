class Solution {
    public static String defangIPaddr(String address) { // make it static
        int n = address.length();
        String ans = "";
        
        for (int i = 0; i < n; i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                ans = ans + "[.]";
            } else {
                ans = ans + ch;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address)); // now works
    }
}
