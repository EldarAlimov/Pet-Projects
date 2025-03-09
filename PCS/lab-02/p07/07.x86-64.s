.section .rodata
output:
	.string "hello, world"

.section .text
.global main

main:
	
	mov $output, %rdi
	call puts

	mov $0, %rax
	ret

