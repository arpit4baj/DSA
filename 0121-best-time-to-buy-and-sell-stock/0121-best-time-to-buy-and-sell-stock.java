class Solution {
    public int maxProfit(int[] prices) {
        int temp=Integer.MAX_VALUE;
        int val=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<temp){
                temp=prices[i];
            }else{
                int p=prices[i]-temp;
                if(val<p){
                    val=p;
                }
            }
        }
        return val;
    }
}