#include <stdio.h>
#include <stdlib.h>

void selectionsort(int* array, int length);

int main(){

    int i;
	int array[] = {5,3,3,8 ,24, 67, 778, 9, 23, 5};
	int length = sizeof(array)/sizeof(array[0]);

	selectionsort(array, length);

	for(i = 0; i < length; i++)
		printf("%d ", array[i]);

}

void selectionsort(int* array, int length){

    int i, j , temp;
	for(i = 0; i < length; i++){
		for(j = i; j < length; j++)
			if(array[j] < array[i]){
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
	}

}
