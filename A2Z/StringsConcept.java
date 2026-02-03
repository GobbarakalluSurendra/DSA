import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        // String Firstname="Surendra";
        // String lastname=Sc.nextLine();
        // if(Firstname.compareTo(lastname)==0){
        //     System.out.println("Strings are Equal");

        // }
        // else{
        //     System.out.println("Strings Are not Equal");
        // }
        // System.out.println(Firstname+" "+lastname);
        // System.out.println("length:"+Firstname.length());
        // for(int i=0;i<Firstname.length();i++){
        //     System.out.println(Firstname.charAt(i));
        // }
        // String Sentence="My Name is Surendra";
        // String name=Sentence.substring(10,Sentence.length());
        // System.out.println(name);

        StringBuilder nameb=new StringBuilder("macha");
        nameb.append("s");

        System.out.println(nameb.length());

        System.out.println(nameb.toString());

        Sc.close();
    }
}