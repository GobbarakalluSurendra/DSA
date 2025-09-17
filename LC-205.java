import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        HashMap<Character,Character> rev=new HashMap<>();
        Boolean ans=true;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(!hm.containsKey(ch1) && !rev.containsKey(ch2)){
                hm.put(ch1,ch2);
                rev.put(ch2,ch1);
            }else if(hm.containsKey(ch1) && hm.get(ch1)!=ch2){
                ans=false;
                break;
            }else if(rev.containsKey(ch2) && rev.get(ch2)!=ch1){
                ans=false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "egg";
        String t1 = "add";
        System.out.println(s1 + " & " + t1 + " -> " + sol.isIsomorphic(s1, t1)); // true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(s2 + " & " + t2 + " -> " + sol.isIsomorphic(s2, t2)); // false

        String s3 = "paper";
        String t3 = "title";
        System.out.println(s3 + " & " + t3 + " -> " + sol.isIsomorphic(s3, t3)); // true
    }
}
