class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> ele=new HashMap<>();
        for(int num:nums1){
            if(ele.containsKey(num)){
                ele.put(num,ele.get(num)+1);
            }else{
                ele.put(num,1);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:nums2){
            if(ele.containsKey(num) && ele.get(num)>0 ){
                ans.add(num);
                ele.put(num,ele.get(num)-1);
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