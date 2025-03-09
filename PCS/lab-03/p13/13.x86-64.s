section .data 

    output_format db "%ld", 10, 0 

  

section .text 

    extern printf 

  

global main 

  

; add1: returns (long) a 

add1: 

    mov rax, rdi 

    ret 

  

; add2: returns (long) a + (long) b 

add2: 

    mov rax, rdi 

    add rax, rsi 

    ret 

  

; add3: returns (long) a + (long) b + (long) c 

add3: 

    mov rax, rdi 

    add rax, rsi 

    add rax, rdx 

    ret 

  

; add4: returns (long) a + (long) b + (long) c + (long) d 

add4: 

    mov rax, rdi 

    add rax, rsi 

    add rax, rdx 

    add rax, rcx 

    ret 

  

; add5: returns (long) a + (long) b + (long) c + (long) d + (long) e 

add5: 

    mov rax, rdi 

    add rax, rsi 

    add rax, rdx 

    add rax, rcx 

    add rax, r8 

    ret 

  

; add6: returns (long) a + (long) b + (long) c + (long) d + (long) e + (long) f 

add6: 

    mov rax, rdi 

    add rax, rsi 

    add rax, rdx 

    add rax, rcx 

    add rax, r8 

    add rax, r9 

    ret 

  

; add7: returns (long) a + (long) b + (long) c + (long) d + (long) e + (long) f + (long) g 

add7: 

    mov rax, rdi 

    add rax, rsi 

    add rax, rdx 

    add rax, rcx 

    add rax, r8 

    add rax, r9 

    add rax, [rsp+8] 

    ret 

  

; add8: returns (long) a + (long) b + (long) c + (long) d + (long) e + (long) f + (long) g + (long) h 

add8: 

    mov rax, rdi 

    add rax, rsi 

    add rax, rdx 

    add rax, rcx 

    add rax, r8 

    add rax, r9 

    add rax, [rsp+8] 

    add rax, [rsp+16] 

    ret 

  

; add9: returns (long) a + (long) b + (long) c + (long) d + (long) e + (long) f + (long) g + (long) h + (long) i 

add9: 

    mov rax, rdi 

    add rax, rsi 

    add rax, rdx 

    add rax, rcx 

    add rax, r8 

    add rax, r9 

    add rax, [rsp+8] 

    add rax, [rsp+16] 

    add rax, [rsp+24] 

    ret 

  

; add10: returns (long) a + (long) b + (long) c + (long) d + (long) e + (long) f + (long) g + (long) h + (long) i + (long) j 

add10: 

    mov rax, rdi 

    add rax, rsi 

    add rax, rdx 

    add rax, rcx 

    add rax, r8 

    add rax, r9 

    add rax, [rsp+8] 

    add rax, [rsp+16] 

    add rax, [rsp+24] 

    add rax, [rsp+32] 

    ret 

  

main: 

    ; call add1(1) 

    mov edi, 1 

    call add1 

    mov rsi, rax 

    lea rdi, [output_format] 

    mov eax, 0 

    call printf 

  

    ; call add2(1, 2) 

    mov edi, 1 

    mov esi, 2 

    call add2 

    mov rsi, rax 

    lea rdi, [output_format] 

    mov eax, 0 

    call printf 

  

    ; call add3(1, 2, 3) 

    mov edi, 1 

    mov esi, 2 

    mov edx, 3 

    call add3 

    mov rsi, rax 

    lea rdi, [output_format] 

    mov eax, 0 

    call printf 

  

    ; call add4(1, 2, 3, 4) 

    mov edi, 1 

    mov esi, 2 

    mov edx, 3 

    mov ecx, 4 

    call add4 

    mov rsi, rax 

    lea rdi, [output_format] 

    mov eax, 0 

    call printf 

  

    ; call add5(1, 2, 3, 4, 5) 

    mov edi, 1 

    mov esi, 2 

    mov edx, 3 

    mov ecx, 4 

    mov r8d, 5 

    call add5 

    mov rsi, rax 

    lea rdi, [output_format] 

    mov eax, 0 

    call printf 

  

    ; call add6(1, 2, 3, 4, 5, 6) 

    mov edi, 1 

    mov esi, 2 

    mov edx, 3 

    mov ecx, 4 

    mov r8d, 5 

    mov r9d, 6 

    call add6 

    mov rsi, rax 

    lea rdi, [output_format] 

    mov eax, 0 

    call printf 

  

    ; call add7(1, 2, 3, 4, 5, 6, 7) 

    mov edi, 1 

    mov esi, 2 

    mov edx, 3 

    mov ecx, 4 

    mov r8d, 5 

    mov r9d, 6 

    mov dword [rsp+8], 7 

    call add7 

    mov rsi, rax 

    lea rdi, [output_format] 

    mov eax, 0 

    call printf 

  

    ; call add8(1, 2, 3, 4, 5, 6, 7, 8) 

    mov edi, 1 

    mov esi, 2 

    mov edx, 3 

    mov ecx, 4 

    mov r8d, 5 

    mov r9d, 6 

    mov dword [rsp+8], 7 

    mov dword [rsp+16], 8 

    call add8 

    mov rsi, rax 

    lea rdi, [output_format] 

    mov eax, 0 

    call printf 

  

    ; call add9(1, 2, 3, 4, 5, 6, 7, 8, 9) 

    mov edi, 1 

    mov esi, 2 

    mov edx, 3 

    mov ecx, 4 

    mov r8d, 5 

    mov r9d, 6 

    mov dword [rsp+8], 7 

    mov dword [rsp+16], 8 

    mov dword [rsp+24], 9 

    call add9 

    mov rsi, rax 

    lea rdi, [output_format] 

    mov eax, 0 

    call printf 

  

    ; call add10(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) 

    mov edi, 1 

    mov esi, 2 

    mov edx, 3 

    mov ecx, 4 

    mov r8d, 5 

    mov r9d, 6 

    mov dword [rsp+8], 7 

    mov dword [rsp+16], 8 

    mov dword [rsp+24], 9 

    mov dword [rsp+32], 10 

    call add10 

    mov rsi, rax 

    lea rdi, [output_format] 

    mov eax, 0 

    call printf 

  

    mov eax, 0 

    ret 
