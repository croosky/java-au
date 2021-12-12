+ [Squares of a Sorted Array](#squares-of-a-sorted-array)

[comment]: <> (Stop)

## Squares of a Sorted Array

https://leetcode.com/problems/squares-of-a-sorted-array/

``` java
public int[] sortedSquares(int[] nums) {
    for(int i=0;i<nums.length;i++){
        nums[i] = nums[i]*nums[i];
    }
    Arrays.sort(nums);
    return nums;
}

```
