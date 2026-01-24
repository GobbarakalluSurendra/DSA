import java.util.*;
class Fact{
    public static void Fact(int a){
        int fact=1;
        for(int i=a;i>=1;i--){
fact*=i;

        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Fact(a);

    }
}