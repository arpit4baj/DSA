class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ele=new HashSet<>();
        for(int num:nums1){
            ele.add(num);
        }
        HashSet<Integer> ans=new HashSet<>();
        for(int num:nums2){
            if(ele.contains(num)){
                ans.add(num);
            }
        }
        int[] res=new int[ans.size()];
        int i=0;
        for(int num:ans){
            res[i]=num;
            i++;
        }
        return res;
        
    }
}