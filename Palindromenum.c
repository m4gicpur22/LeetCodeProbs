#include <stdio.h>
#include <stdlib.h>

bool isPalindrome(int x) {
    int result;
    
    if(x == isPalin(x))
        return true;
    
    
    return false;
}
           
int isPalin(x){
    int reverse = 0, remainder;

    while(x > 0){
        
    remainder = x%10;
    reverse = reverse * 10 + remainder;
    x /= 10;
        
    }
    
    return reverse;
}