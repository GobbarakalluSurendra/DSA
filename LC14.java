import java.util.*;
class LC14{
    public static void main(String[] args) {
        String []strs={"flower","flow","flight"};
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int index=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        if(index==0)
        System.out.println(" ");
        else
        System.out.println(str1.substring(0,index));
    }
}