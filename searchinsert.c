#include <stdio.h>
#include <stdlib.h>
//O(N) Solution
int searchInsert(int* nums, int numsSize, int target) {
    
    int i, result = 0;
    
    for(i = 0; i < numsSize; i++){
        
        if(nums[i] >= target)
            return i;        
    }
    
    return numsSize;
    
}
//O(log N) Solution
int searchInsert(int* nums, int numsSize, int target) {
    
    int low = 0, high = numsSize, mid = 0;
    
    while(low <= high){
        
        mid = (low + high)/2;
        if(target == nums[mid])
            return mid;
        else if(target < nums[mid])
            high = mid - 1;
        else
            low = mid + 1;       
    }
    if(target > array[numsSize-1])
    	return numsSize;
    else if(target < array[0])
    	return 0;
    else
    	return low;
}

