import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
    String str="Chinnu";
    int n=str.length();
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            String temp=str.substring(i,j+1);
            arr.add(temp);
                // System.out.print(str.substring(i,j+1));

                //         System.out.println();

        }
    }
    System.out.println(arr);
    }
}