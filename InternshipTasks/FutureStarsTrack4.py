import torch
import numpy as np
import pygame

# Tensor dimensions
SIZE = 20
MARGIN = 2  # Margin between cells

# Create a 4D tensor with random values
tensor = torch.randint(0, 256, (SIZE, SIZE, SIZE, SIZE), dtype=torch.uint8)

# Pygame setup
pygame.init()
WINDOW_SIZE = 800
grid_size = WINDOW_SIZE - 50
CELL_SIZE = grid_size // SIZE
screen = pygame.display.set_mode((WINDOW_SIZE, WINDOW_SIZE))
pygame.display.set_caption("4D Tensor Viewer")

# Font setup
pygame.font.init()
font = pygame.font.SysFont(None, CELL_SIZE // 2)
info_font = pygame.font.SysFont(None, 24)

# Initial slice indices
w, z = 0, 0


def render_slice():
    screen.fill((0, 0, 0))
    slice_2d = tensor[w, z].numpy()
    for i in range(SIZE):
        for j in range(SIZE):
            value = slice_2d[i, j]
            rect_x = j * (CELL_SIZE + MARGIN) + 25  # Offset for margin
            rect_y = i * (CELL_SIZE + MARGIN) + 25
            pygame.draw.rect(screen, (value, value, value), (rect_x, rect_y, CELL_SIZE, CELL_SIZE))

            # Determine text color based on brightness
            text_color = (0, 0, 0) if value > 128 else (255, 255, 255)
            text_surface = font.render(str(value), True, text_color)
            text_rect = text_surface.get_rect(center=(rect_x + CELL_SIZE // 2, rect_y + CELL_SIZE // 2))
            screen.blit(text_surface, text_rect)

    # Display current slice position in the upper right corner
    position_text = f"w={w}, z={z}"
    position_surface = info_font.render(position_text, True, (255, 255, 255))
    screen.blit(position_surface, (WINDOW_SIZE - 120, 10))

    pygame.display.flip()


# Main loop
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        elif event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT and w > 0:
                w -= 1
            elif event.key == pygame.K_RIGHT and w < SIZE - 1:
                w += 1
            elif event.key == pygame.K_UP and z > 0:
                z -= 1
            elif event.key == pygame.K_DOWN and z < SIZE - 1:
                z += 1

    render_slice()

pygame.quit()