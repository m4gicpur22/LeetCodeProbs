#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void numJewelsInStones(char* J, char* S);

int main(){
    char char1[50], char2[50];

    scanf("%s %s", char1, char2);

    numJewelsInStones(&char1, &char2);

}


void numJewelsInStones(char* J, char* S) {

    int count = 0, i, j;
    int length1 = strlen(S);
    int length2 = strlen(J);
    //runs through first string, then runs through second string
    //compares both strings together and sees which letters match
    for(i = 0; i < length1; i++){
        for(j = 0; j < length2; j++){
            if(S[i] == J[j])
                count++;
        }
    }

    printf("%d", count);

    return;
}

/*Alternative efficient solution(to be done in java)
would be to run a loop on J string, place it in a hashset and
then run a loop through S string seperately and find/match that string with it in the hashset,
incrementing it everytime*/
