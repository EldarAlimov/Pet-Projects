.section .rodata 

format_input:    

	.string "%ld %ld %ld %ld" 

format_output:   

	.string "%ld\n" 

  

.section .text 

.global main 

  

struc v2d_t 

    .x: resq 1 

    .y: resq 1 

endstruc 

  

dot: 

    mov rax, [rdi]    
    imul rax, [rsi]     
    mov rcx, [rdi+8]  
    imul rcx, [rsi+8]   
    add rax, rcx     
    ret 

  

dot_ptr: 

    mov rax, [rdi]      
    imul rax, [rsi]   
    mov rcx, [rdi+8] 
    imul rcx, [rsi+8]  
    add rax, rcx      
    ret 

  

main: 

    sub rsp, 32       

  
    lea rdi, [rsp+8]    
    lea rsi, [rsp+16]  
    lea rdx, [rsp+24]  
    lea rcx, [rsp+32]  
    mov r8, format_input 
    xor eax, eax 
    call scanf        

  
    lea rdi, [rsp+8]   
    lea rsi, [rsp+24]  
    call dot           

  
    mov rdi, format_output 
    mov rsi, rax      
    xor eax, eax 
    call printf       

  
    lea rdi, [rsp+8]   
    lea rsi, [rsp+24]   
    call dot_ptr       

  
    mov rdi, format_output 
    mov rsi, rax        
    xor eax, eax 
    call printf        


    add rsp, 32         
    xor eax, eax 
    ret 
