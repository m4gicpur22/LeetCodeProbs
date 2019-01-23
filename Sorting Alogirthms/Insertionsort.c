#include <stdio.h>
#include <stdlib.h>

int insertionsort(int* array, int length);

int main(){
    int i;
	int array[] = {67, 1, 89, 34, 67, 89, 4, 9, 7, 6};
	int length = sizeof(array)/sizeof(array[0]);
	insertionsort(array, length);

	for(i =0; i < length; i++)
        printf("%d ", array[i]);
}

int insertionsort(int* array, int length){
	int i, temp, j;

	for(i= 1; i < length; i++){
		
	temp = array[i];
	j = i -1;

	while(array[j] > temp){
			array[j+1] = array[j];
			j--;

			if(j == -1)
				break;
	}

	array[j+1] = temp;


	}

}
