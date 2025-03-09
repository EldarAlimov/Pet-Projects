size_t my_strlen(const char *str) {

    size_t length = 0;
    while (*str != '\0') {
        length++;
        str++;
    }

    return length;
}


void my_strncpy(char *destination, const char *source, size_t n) {

    size_t i;
    for (i = 0; i < n && source[i] != '\0'; i++) {
        destination[i] = source[i];
    }

    for (; i < n; i++) {
        destination[i] = '\0';
    }

}

void my_strcat(char *str1, const char *str2) { 

    while (*str1 != '\0') { 
        str1++; 
    } 

    while (*str2 != '\0') { 
        *str1 = *str2; 
        str1++; 
        str2++; 
    } 

    *str1 = '\0'; 
}

char* my_strchr(const char *str, char c) {

    while (*str != '\0') {
        if (*str == c) {
            return (char*) str;
        }
        str++;
    }
    return NULL;
}



int my_strcmp(const char *str1, const char *str2) { 

    while (*str1 != '\0' && *str2 != '\0') { 
        if (*str1 != *str2) { 
            return *str1 - *str2; 
        } 
        str1++; 
        str2++; 
    } 
    return *str1 - *str2; 
} 



