#ifndef INT_STACK_H 

#define INT_STACK_H 

typedef struct { 

    int* data; 
    int count; 
    int capacity; 

} int_stack_t; 


int_stack_t int_stack_create(); 
void int_stack_push(int_stack_t* stack, int value); 
int int_stack_pop(int_stack_t* stack); 
void int_stack_destroy(int_stack_t* stack); 
#endif 
