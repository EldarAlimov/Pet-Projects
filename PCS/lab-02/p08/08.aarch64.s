.section .data
num:
	.quad 0

.section .rodata
input_format:
	.string "%lld"
output_format:
	.string "%lld\n"

.section .text
.global mian
main:
	str lr, [sp, -8]!	

	adr x0, input_format
	adr x1, num 
	bl scanf

	
	adr x2, num 
	ldr x1, [x2]
	add x1, x1, 1

	adr x0, output_format
	bl printf
	
	ldr lr, [sp], 8
	mov x0 , 0
	ret
