.section .rodata
input_format:
	.string "%ld %ld"
output_format:
	.string "%ld / %ld = %ld\n"

.section .data
num1:
	.quad 0
num2:
	.quad 0

.section .text
.global main
main:
	str lr, [sp, -16]!

	adr x0, input_format
	adr x1, num1
	adr x2, num2
	bl scanf
	

	adr x1, num1
	ldr x1, [x1]
	adr x2, num2
	ldr x2, [x2]


	udiv x3, x1, x2

	adr x0, output_format
	bl printf

	ldr lr, [sp], 16
	mov x0, 0
	ret
