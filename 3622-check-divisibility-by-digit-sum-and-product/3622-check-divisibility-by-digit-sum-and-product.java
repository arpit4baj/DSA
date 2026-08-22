class Solution {
    public boolean checkDivisibility(int n) {
        int or=n;
        int sum=0;
        int pro=1;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit;
            pro=pro*digit;
            n=n/10;
            
        }
        if (or%(sum+pro)==0){
            return true;
        }
        else{
            return false; 
        }
    }
}