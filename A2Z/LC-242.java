// class Solution {
//     public boolean isAnagram(String s, String t) {
//          char[] ch = s.toCharArray();

//         // Sort characters
//         Arrays.sort(ch);

//         // Convert back to string
//         String s2 = new String(ch);
//          char[] ch1 = t.toCharArray();

//         // Sort characters
//         Arrays.sort(ch1);

//         // Convert back to string
//         String s1 = new String(ch1);
//         if(s2.compareTo(s1)==0){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }

///2nd Method
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        // Step 1: If lengths differ, not an anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Convert to char arrays
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        // Step 4: Compare sorted arrays
        return Arrays.equals(sArr, tArr);
    }
}