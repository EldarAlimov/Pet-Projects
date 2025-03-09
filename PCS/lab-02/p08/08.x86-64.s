.section .rodata
input_format:
	.string "%ld"

output_format:
	.string "%ld\n"
.section .data
num:
	.quad 0

.section .text
.global main
main:
	push %rbp
	mov %rsp, %rbp

	mov $input_format, %rdi
	mov $num, %rsi
	mov $0, %al
	call scanf

	incq num
	
	mov $output_format, %rdi
	mov num, %rsi
	mov $0, %al
	call printf
	
	mov %rbp, %rsp
	pop %rbp
	
	mov $0, %eax
	ret
	

