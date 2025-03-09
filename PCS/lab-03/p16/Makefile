CC = gcc 

CFLAGS = -Wall -Wextra 

  

all: program 

  

program: main.o int_stack.o 

    $(CC) $(CFLAGS) -o program main.o int_stack.o 

  

main.o: main.c int_stack.h 

    $(CC) $(CFLAGS) -c main.c 

  

int_stack.o: int_stack.c int_stack.h 

    $(CC) $(CFLAGS) -c int_stack.c 

  

clean: 

    rm -f program main.o int_stack.o 
