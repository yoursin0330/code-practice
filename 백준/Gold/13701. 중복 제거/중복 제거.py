import sys

visited = bytearray(1 << 22)  # 2^25 bits = 4MB
write = sys.stdout.write

num = 0
has_num = False

while True:
    ch = sys.stdin.read(1)
    if not ch:
        break

    if ch == ' ' or ch == '\n':
        if has_num:
            byte_index = num >> 3
            bit_offset = num & 7
            mask = 1 << bit_offset

            if not visited[byte_index] & mask:
                visited[byte_index] |= mask
                write(f"{num} ")

            num = 0
            has_num = False
    else:
        num = num * 10 + ord(ch) - ord('0')
        has_num = True
