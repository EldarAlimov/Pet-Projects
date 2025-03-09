.section .data 

    output_format: .asciz "%ld\n" 

  

.section .text 

    .globl main 

    .extern printf 

  

main: 

    // call add1(1) 

    mov w0, 1 

    bl add1 

    mov x1, x0 

    ldr x0, =output_format 

    mov w8, 0 

    bl printf 

  

    // call add2(1, 2) 

    mov w0, 1 

    mov w1, 2 

    bl add2 

    mov x1, x0 

    ldr x0, =output_format 

    mov w8, 0 

    bl printf 

  

    // call add3(1, 2, 3) 

    mov w0, 1 

    mov w1, 2 

    mov w2, 3 

    bl add3 

    mov x1, x0 

    ldr x0, =output_format 

    mov w8, 0 

    bl printf 

  

    // call add4(1, 2, 3, 4) 

    mov w0, 1 

    mov w1, 2 

    mov w2, 3 

    mov w3, 4 

    bl add4 

    mov x1, x0 

    ldr x0, =output_format 

    mov w8, 0 

    bl printf 

  

    // call add5(1, 2, 3, 4, 5) 

    mov w0, 1 

    mov w1, 2 

    mov w2, 3 

    mov w3, 4 

    mov w4, 5 

    bl add5 

    mov x1, x0 

    ldr x0, =output_format 

    mov w8, 0 

    bl printf 

  

    // call add6(1, 2, 3, 4, 5, 6) 

    mov w0, 1 

    mov w1, 2 

    mov w2, 3 

    mov w3, 4 

    mov w4, 5 

    mov w5, 6 

    bl add6 

    mov x1, x0 

    ldr x0, =output_format 

    mov w8, 0 

    bl printf 

  

    // call add7(1, 2, 3, 4, 5, 6, 7) 

    mov w0, 1 

    mov w1, 2 

    mov w2, 3 

    mov w3, 4 

    mov w4, 5 

    mov w5, 6 

    mov w6, 7 

    bl add7 

    mov x1, x0 

    ldr x0, =output_format 

    mov w8, 0 

    bl printf 

  

    // call add8(1, 2, 3, 4, 5, 6, 7, 8) 

    mov w0, 1 

    mov w1, 2 

    mov w2, 3 

    mov w3, 4 

    mov w4, 5 

    mov w5, 6 

    mov w6, 7 

    mov w7, 8 

    bl add8 

    mov x1, x0 

    ldr x0, =output_format 

    mov w8, 0 

    bl printf 

  

    // call add9(1, 2, 3, 4, 5, 6, 7, 8, 9) 

    mov w0, 1 

    mov w1, 2 

    mov w2, 3 

    mov w3, 4 

    mov w4, 5 

    mov w5, 6 

    mov w6, 7 

    mov w7, 8 

    mov w8, 9 

    bl add9 

    mov x1, x0 

    ldr x0, =output_format 

    mov w8, 0 

    bl printf 

  

    // call add10(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) 

    mov w0, 1 

    mov w1, 2 

    mov w2, 3 

    mov w3, 4 

    mov w4, 5 

    mov w5, 6 

    mov w6, 7 

    mov w7, 8 

    mov w8, 9 

    mov w9, 10 

    bl add10 

    mov x1, x0 

    ldr x0, =output_format 

    mov w8, 0 

    bl printf 

  

    mov w0, 0 

    ret 

  

add1: 

    mov x0, x0 

    ret 

  

add2: 

    add x0, x0, x1 

    ret 

  

add3: 

    add x0, x0, x1 

    add x0, x0, x2 

    ret 

  

add4: 

    add x0, x0, x1 

    add x0, x0, x2 

    add x0, x0, x3 

    ret 

  

add5: 

    add x0, x0, x1 

    add x0, x0, x2 

    add x0, x0, x3 

    add x0, x0, x4 

    ret 

  

add6: 

    add x0, x0, x1 

    add x0, x0, x2 

    add x0, x0, x3 

    add x0, x0, x4 

    add x0, x0, x5 

    ret 

  

add7: 

    add x0, x0, x1 

    add x0, x0, x2 

    add x0, x0, x3 

    add x0, x0, x4 

    add x0, x0, x5 

    add x0, x0, x6 

    ret 

  

add8: 

    add x0, x0, x1 

    add x0, x0, x2 

    add x0, x0, x3 

    add x0, x0, x4 

    add x0, x0, x5 

    add x0, x0, x6 

    add x0, x0, x7 

    ret 

  

add9: 

    add x0, x0, x1 

    add x0, x0, x2 

    add x0, x0, x3 

    add x0, x0, x4 

    add x0, x0, x5 

    add x0, x0, x6 

    add x0, x0, x7 

    add x0, x0, x8 

    ret 

  

add10: 

    add x0, x0, x1 

    add x0, x0, x2 

    add x0, x0, x3 

    add x0, x0, x4 

    add x0, x0, x5 

    add x0, x0, x6 

    add x0, x0, x7 

    add x0, x0, x8 

    add x0, x0, x9 

    ret 
