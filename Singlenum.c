int singleNumber(int* nums, int numsSize) {
    
    int i;
    int nonrepeat = 0;
    
    
    for(i = 0; i < numsSize; i++){
        nonrepeat ^= nums[i];
    }
    
    return nonrepeat;
    
}