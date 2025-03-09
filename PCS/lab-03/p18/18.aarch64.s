.section .rodata 

format_input:    

	.string "%ld %ld %ld %ld" 

format_output:   

	.string"%ld\n" 

  

.section .bss 

    .align 3 

a:  .xquad 0 

    .xquad 0 

b:  .xquad 0 

    .xquad 0 

  

.section .text 

.global main 



  

dot: 
    ldr x1, [x0]      
    ldr x2, [x1]       
    ldr x3, [x0, 8]     
    ldr x4, [x1, 8]   
    mul x0, x2, x1     
    madd x0, x4, x3, x0  
    ret 

  

dot_ptr: 

    ldr x1, [x0]      
    ldr x2, [x1]     
    ldr x3, [x0, 8]      
    ldr x4, [x1, 8]    
    mul x0, x2, x1   
    madd x0, x4, x3, x0  
    ret 

  

main: 

    stp x29, x30, [sp, -16]!    
    mov x29, sp               

  
    ldr x0, =a               
    ldr x1, =b                
    ldr x2, =format_input 
    mov x8, 0                  
    bl scanf                  

  
    ldr x0, =a             
    ldr x1, =b               
    bl dot               

  
    ldr x0, =format_output 
    mov x1, x0               
    mov x8, 0         
    bl printf               

  
    ldr x0, =a               
    ldr x1, =b            
    bl dot_ptr               
    ldr 
