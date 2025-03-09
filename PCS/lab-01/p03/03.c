#include <stdio.h>

int main(void)
{
	char input[512];

	puts("What is your full name?");
	gets(input);

	printf("Hello, %s!\n", input);
        return 0;
}
