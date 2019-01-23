#include <stdio.h>
#include <stdlib.h>

int main(){
	//width values represent each count of letter in S
	//we would have to multiple each individual with how many strings are given
	//Simple solution :
	/*
				Multiply each individual letter in String S by their count values in width,
				then divide/mod values by 100, divide will give the num of lines needed and mod
				will give which line gives units less than 100


	*/





}

int* numberOfLines(int* widths, int widthsSize, char* S, int* returnSize) {

	//set each position of width to the letters of the alplabet
	int line = 1;


	for(i = 0; i S[i]; i++){
		len += widths[S[i] - 'a'];

		if(len > 100){
			line++;
			unitlen = len % 100;
		}
		else{
			line = 1;
			unitlen = len % 100;
		}


	}

	*returnSize = 2;

	int* returnarray = (int *)malloc((*returnSize)*sizeof(int));
	returnarray[0] = line;
	returnarray[1] = unitlen;

	return returnarray;
    
}