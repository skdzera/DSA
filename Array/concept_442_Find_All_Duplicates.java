class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      /* key insight : - all numbers are in range of 1 and n .
       we can  use the array indices themseleves to track which numbers we've seen before.
       for below approach it is mandatory that each elemen should be in between 1 to n.
       */
      /* [4,3,2,7,8,2,3,1]
      [4,3,2,-7,8,2,3,1]
      [4,3,-2,-7,8,2,3,1]
      [4,-3,-2,-7,8,2,3,1]
      [4,-3,-2,-7,8,2,-3,1]
      [4,-3,-2,-7,8,2,-3,-1]
      [4,-3,-2,-7,8,(2),-3,-1] it check at index = 1 (2-1) the element is negeative so it is the duplicate element and stores it in arraylistt
      [4,-3,-2,-7,8,(2),(-3),-1] at index = 2 (abs(-3) -1) is element is also negative hence it is also duplicate 
      ```
      */
        int n = nums.length;
        List<Integer>lst = new ArrayList<>();
        for(int i=0;i<n;i++){
                    int index = Math.abs(nums[i])-1;

                if(nums[index]<0){
                    lst.add(Math.abs(nums[i]));
                }
                else {
                nums[index] = -1*nums[index];
                }
            
        }
        return lst;

    }
}
