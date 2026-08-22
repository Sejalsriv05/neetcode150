class Solution {
    public boolean hasDuplicate(int[] nums) {
        /**for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;**/
        /*HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(int count:map.values()){
            if(count>1){
                return true;
            }
        }
        return false;


    }      
    
}*/
HashSet <Integer> set=new HashSet<>();
for(int num:nums){
    if(set.contains(num)){
        return true;
    }
    set.add(num);
}
return false;
    }
}
