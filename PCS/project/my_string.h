#ifndef MY_STRING_H
#define MY_STRINH_H


typedef struct {
	char* data;
	int length;
} my_string;


void my_string_init(my_string* str, const char* input) { 

	int input_length = 0; 
	while (input[input_length] != '\0') { 
		input_length++; 
	} 
  
	str->length = input_length; 
	str->data = (char*)malloc((str->length + 1) * sizeof(char)); 

	int i; 
	for (i = 0; i < str->length; i++) { 
		str->data[i] = input[i]; 
	} 
	str->data[str->length] = '\0'; 
}

void my_string_resize(my_string* str, int new_size) {

	char* new_data = (char*)malloc((new_size + 1) * sizeof(char));

	int i;
	for (i = 0; i < str->length && i < new_size; i++) {
		new_data[i] = str->data[i];
	}

	for (; i <= new_size; i++) {
		new_data[i] = '\0';
	}

	if (str->data != NULL){
		char* temp = str->data;
		str->data = NULL;
		free(temp);
	}
	str->data = new_data;
	str->length = new_size;
}

void my_string_append_char(my_string* str, char c) {

	int new_length = str->length + 1;
	my_string_resize(str, new_length);

	str->data[str->length - 1] = c;
	str->data[str->length] = '\0';

}

void my_string_concat(my_string* str, const char* input) {

	int input_length = 0;
	while (input[input_length] != '\0') {
		input_length++;
    	}
    	int new_length = str->length + input_length;
    	my_string_resize(str, new_length);

    	int i;
    	for (i = 0; i < input_length; i++) {
        	str->data[str->length - input_length + i] = input[i];
    	}
    	str->data[str->length] = '\0';
}

void my_string_free(my_string* str) {

    free(str->data);
    str->data = NULL;
    str->length = 0;

}

#endif
