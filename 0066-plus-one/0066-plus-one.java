class Solution {
    public int[] plusOne(int[] digits) {
        int i=0;
        for (int j=digits.length-1;j>=0;j--){
            if (digits[j]<9){
               digits[j]++;
               return digits;
            }
            digits[j]=0;
        }
        int newarr[] = new int[digits.length+1];
        newarr[0]=1;
        return newarr;
    }
}