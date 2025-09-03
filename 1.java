class First{
    public static void main(String arg[]){
        int args[]={5,8,10,11,50,15,20,25};
        int max=args[0];
        int n=args.length;

        for(int i=1;i<n-1;i++){
            // if(max<args[i]){
            //     max=args[i];
            // }
            max=Math.max(args[i],max);
        }
        System.out.println(max);
    }
}