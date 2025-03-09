#include <stdio.h>

#include "my_string.h"

int main() {
    my_string str;

    // Initialize the structure with a given string
    my_string_init(&str, "hello");

    // Append a character to the structure
    my_string_append_char(&str, ' ');

    // Concatenate another string to the structure
    my_string_concat(&str, "world");

    // Print the final string and its length
    printf("String: %s\n", str.data);
    printf("Length: %d\n", str.length);

    // Free the memory allocated for the structure
    my_string_free(&str);
    return 0;
}
