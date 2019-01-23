#include <stdio.h>
#include <stdlib.h>


int main(){

	int array[10] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0}, i;

	int length = sizeof(array)/sizeof(array[0]);

	int newarray[length], temp, k = length -1;

	printf("Array data \n");

	for(i = 0; i < length; i++){
		printf("%d ", array[i]);
	}

	for(i = length/2; i < k; i++, k--)
	{
	    temp = array[i];
	    array[i] = array[k];
	    array[k] = temp;

	}
	for(i = 0, k = (length/2)-1; i < k -1; i++, k--){
        temp = array[i];
	    array[i] = array[k];
	    array[k] = temp;
	}
	printf("\nAfter processing\n");

	for(i = 0; i < length; i++){
		printf("%d ", array[i]);
	}

	return 0;

}
