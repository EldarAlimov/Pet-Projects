#include "int_stack.h" 

  

int_stack_t int_stack_create() { 

    int_stack_t stack; 
    stack.data = NULL; 
    stack.count = 0; 
    stack.capacity = 0; 
    return stack; 
} 

  

void int_stack_push(int_stack_t* stack, int value) { 

    if (stack->count >= stack->capacity) { 
        stack->capacity = (stack->capacity == 0) ? 1 : stack->capacity * 2; 
        stack->data = realloc(stack->data, stack->capacity * sizeof(int)); 

    } 

    stack->data[stack->count++] = value; 

} 

  

int int_stack_pop(int_stack_t* stack) { 

    if (stack->count > 0) { 
        return stack->data[--stack->count]; 
    } else { 
        return 0;
    } 

} 

  

void int_stack_destroy(int_stack_t* stack) { 

    free(stack->data); 
    stack->data = NULL; 
    stack->count = 0; 
    stack->capacity = 0; 

} 
