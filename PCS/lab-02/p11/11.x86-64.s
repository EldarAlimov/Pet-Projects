.section .rodata
input_format:
	.string "%ld %ld"
output_format:
	.string "%ld + %ld = %ld\n"
.section .data
num1:
	.quad 0
num2:
	.quad 0
.section .text
.global main
main:
	push %rbp
	mov %rsp, %rbp

	sub $16, %rbp

	mov $input_format, %rdi
	lea (%rsp), %rsi
	lea 8(%rsp), %rdx
	mov $0, %al
	call scanf
	
	mov $output_format, %rdi
	mov (%rsp), %rax
	mov (%rsp), %rsi
	mov 8(%rsp), %rdx


	idivq %rdx
	mov %rax, %rcx


	mov $0, %al
	call printf
	
	leave
	
	mov $0, %ax
	ret
	
