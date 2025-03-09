#include <stdio.h>
#include "strutil.h"

int main(void){

	const char *str1 = "hello";
	const char *str2 = "world";
	
	// Test my_strlen
	printf("Length of str1: %ld\n", my_strlen(str1));

	// Test my_strncpy
	char destination[20] = "world";
	my_strncpy(destination, str1, 3);
	printf("strncpy result: %s\n", destination);

	// Test my_strncat
    	my_strcat(destination, str2);
    	printf("strncat result: %s\n", destination);


 	// Test my_strchr
    	const char *result = my_strchr(str1, 'l');
    	if (result) {
    	    printf("strchr result: %s\n", result);
    	} else {
    	    printf("Character not found\n");
    	}

    	// Test my_strcmp
    	int cmp_result = my_strcmp(str1, str2);
    	if (cmp_result < 0) {
        	printf("str1 is lexicographically smaller than str2\n");
    	} else if (cmp_result > 0) {
        	printf("str1 is lexicographically greater than str2\n");
    	} else {
        	printf("str1 and str2 are equal\n");
    	}


	return 0;
}
