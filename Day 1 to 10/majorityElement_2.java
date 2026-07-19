import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Integer i : map.keySet()){
            if(map.get(i) > n /3 ){
                l.add(i);
            }
        }

        return l;
    }
}