// class Solution {
//     public static void main(String args[]) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         int maxProfit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             for (int j = i + 1; j < prices.length; j++) {
//                 int profit = prices[j] - prices[i];  // sell - buy
//                 if (profit > maxProfit) {
//                     maxProfit = profit;
//                 }
//             }
//         }

//         System.out.println("Maximum Profit = " + maxProfit);
//     }
// }
//output:Maximum Profit = 5
//Time complexity :o(n^2)


class Solution {
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int maxProfit = 0;
        int low=prices[0];
        for (int i = 1; i < prices.length; i++) {
            int temp=prices[i]-low;
            maxProfit=Math.max(maxProfit,temp);
            if(prices[i]<low){
                low=prices[i];
            }

            
        }

        System.out.println("Maximum Profit = " + maxProfit);
    }
}
//output:Maximum Profit = 5
//Time complexity :o(n) 