#include <stdlib.h> 

#include <time.h> 

  

void init_random(void) { 

    srand(time(NULL)); 

} 


  

int random_in_range(int min, int max) { 

 

    return min + rand() % (max - min + 1); 

} 
