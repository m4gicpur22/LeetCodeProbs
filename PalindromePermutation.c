//Sololution 1
char* reverseString(char* s) {
    
    int length = strlen(s)-1, i, j = 0, k = length;
    char temp;


    
    for(i = 0; i < k; i++, k--){
        temp = s[i];
        s[i] = s[k];
        s[k] = temp;
        
    }
    
    return s;
}

//Solution 2

char* reverseString(char* s) {
    
    
    if()

    reverseString(&s);
    

    
    return s;
}