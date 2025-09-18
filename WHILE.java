
import java.util.HashSet;

class Solution{
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(5);
        hs.add(6);
        hs.add(0);
        int i=0;
        while(hs.size()>0){
            System.out.println(i+"Chinnu");
            if(i==0){
                hs.remove(5);
                hs.remove(3);
                i++;
            }else{
                hs.remove(0);
            }
        }
    }
}