import sys
# sys.stdin = open("input/01_input.txt", "r")
sys.stdin = open("input/01_input_02.txt", "r")

num, m = map(int, input().split())
num = list(map(int, str(num)))
stack = []

for x in num:
    # stack이 존재, m > 0보다 크고, stack[-1]보다 x가 크면 pop()
    while stack and m > 0 and stack[-1] < x:
        stack.pop()
        m -= 1
    stack.append(x)

# 나머지 부분 처리
if m != 0:
    stack = stack[:-m]

print(''.join(map(str, stack)))
