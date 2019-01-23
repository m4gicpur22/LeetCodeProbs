#include <stdlib.h>
#include <stdio.h>
#include <limits.h>

int main(){

    int x, reversenum = 0;

    scanf("%d", &x);

    if(x > INT_MAX){
        reversenum = 0;
    }
    else {
        while(x){
        reversenum = (reversenum*10) + (x%10);
        x /= 10;
        if(x == 0)
            break;
        }
    }
    printf("%d\n", reversenum);

    return 0;
}
