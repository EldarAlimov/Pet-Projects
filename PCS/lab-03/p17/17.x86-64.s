.section .rodata 
format_input:   
	.string "%ld %ld"  
format_output:
	.string "Before swap: %ld %ld", 10, "After swap: %ld %ld\n" 

  

.section .text 

.global main 
 

  

swap: 

    mov rax, [rdi]     
    mov rcx, [rsi]       
    mov [rdi], rcx       
    mov [rsi], rax       
    ret 

  

main: 

    sub rsp, 8           

  
    lea rdi, [rsp+8]     
    lea rsi, [rsp+16]    
    mov rdx, format_input 
    xor eax, eax 
    call scanf           

  

    lea rdi, [rsp+8]     
    lea rsi, [rsp+16]    
    call swap            

  

    lea rdi, [format_output] 
    mov rsi, [rsp+8]    
    mov rdx, [rsp+16]    
    xor eax, eax 
    call printf          


    add rsp, 8           
    xor eax, eax 
    ret 
