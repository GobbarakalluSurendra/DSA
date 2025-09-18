import java.util.HashMap;
class Main {
    public static void main(String[] args) {
    HashMap <Integer,Integer> Chinnu=new HashMap<>();
    int arr[]={1,5,8,0,1,8,1,5,1};
    for(int i=0;i<arr.length;i++){
        int n=arr[i];
        if(Chinnu.containsKey(n)){
            int prev=Chinnu.get(n);
            Chinnu.put(n,prev+1);
        }
        else{
            Chinnu.put(n,1);
        }
    }
    for(int c:Chinnu.keySet()){
        System.out.println(c+" ----> "+Chinnu.get(c));
    }
    }
 
}