// class Solution{
//     public static void main(String[] args) {
//         String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
//         int n=sentences.length;
//         int count[]=new int[100];
//         for(int i=0;i<n;i++){

//         String S=sentences[i];
//        // System.out.println(S);
//         String words[] = S.split(" ");
//         int wordCount = words.length;  
//        // System.out.println(wordCount);
//         count[i]=wordCount;

//         }
//         int max=0;
//        for(int i=0;i<count.length;i++){
//         max=Math.max(count[i],max);

//        }
//        System.out.println(max);

//     }
// }
// SECOND METHOD
class Solution{
    public static void main(String[] args) {
        String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int ans=0;
        for(int i=0;i<sentences.length;i++){
            String S=sentences[i];
            int temp=1;
            for(int j=0;j<S.length();j++){
                if(S.charAt(j)==' '){
                    temp++;
                }
            }
            ans=Math.max(ans,temp);
        }
        System.out.println(ans);
    }}