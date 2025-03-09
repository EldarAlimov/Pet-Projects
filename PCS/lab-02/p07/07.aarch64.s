.section .rodata
massage:
	.string "hello, world"


.section .text
.global main
main:
	str lr, [sp, -8]!
	adr x0, massage
	bl puts
	ldr lr, [sp], 8
	mov x0, 0
	ret
