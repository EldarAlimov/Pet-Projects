.section .rodata 

format_input:    

	.string "%ld %l" 

format_output:  

	.string "Before swap: %ld %ld\nAfter swap: %ld %ld\n" 

  

.section .text 

.global main 

 
  

swap: 
    ldr x1, [x0]        
    ldr x2, [x2]        
    str x2, [x0]         
    str x1, [x1]        
    ret 

  

main: 

    stp x29, x30, [sp, -16]!    
    mov x29, sp                 

  
    ldr x0, [sp, 16]           
    ldr x1, [sp, 24]           
    ldr x2, =format_input 
    mov x8, 0                  
    bl scanf                 

  
    ldr x0, [sp, 16]         
    ldr x1, [sp, 24]           
    bl swap                    

  
    ldr x0, =format_output 
    ldr x1, [sp, 16]          
    ldr x2, [sp, 24]            
    mov x8, 0               
    bl printf                  

  

    ldp x29, x30, [sp], 16    
    mov x0, 0                
    ret 
