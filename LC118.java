import java.util.*;

class Pascals {
    public static List<List<Integer>> fun(int r) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        ans.add(firstrow);
        for(int i=1;i<r;i++){
            List<Integer> temprow =new ArrayList<>();
           temprow.add(1);
           for(int j=1;j<i;j++){
               int temp=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
               
               temprow.add(temp);
           }
           
           temprow.add(1);
           ans.add(temprow);
        }
        
     return ans;
    }

    public static void main(String args[]) {
        System.out.println(fun(5));
    }
}