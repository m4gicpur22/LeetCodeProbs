#include <stdio.h>
#include <stdlib.h>

void mergesort(int* array, int length);
void mergesortrec(int* array,int temp[], int low, int high);
void mergehalves(int* array, int temp[], int low, int high);


int main(){
	int i;
	int array[] = {56, 78, 78, 65, 23, 43, 678, 1, 6, 9};
	int length = sizeof(array)/sizeof(array[0]);

	mergesort(array, length);

	for(i = 0; i < length; i++)
		printf("%d ", array[i]);



}

void mergesort(int* array, int length){
	int newarray[length];
	mergesortrec(array, newarray, 0, length-1);
}


void mergesortrec(int* array, int temp[], int left1, int right2){
	if(left1 >= right2)
		return;

	int mid = (left1 +right2)/2;

	mergesortrec(array, temp, left1, mid);
	mergesortrec(array, temp, mid + 1, right2);
	mergehalves(array, temp, left1, right2);

}

void mergehalves(int* array, int temp[], int left1, int right2){
	int mid = (left1 + right2)/2;
	int right1 = mid + 1;
	int size = right2 - left1 + 1;

	int left = left1;
	int right = right1;
	int index = left1;

	while(left <= mid && right <= right2){
		if(array[left] <= array[right]){
			temp[index] = array[left];
			left++;
		}
		else{
			temp[index] = array[right];
			right++;
		}
		index++;
	}

	while(left <= right1){
		temp[index] = array[left];
		left++;
		index++;
	}

	while(right <= right2){
		temp[index] = array[right];
		right++;
		index++;
	}



	index = 0;
	left = left1;
	while(left <= right2){
		array[left] = temp[index];
		left++;
		index++;
	}

}
