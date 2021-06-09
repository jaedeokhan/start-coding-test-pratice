import sys
sys.stdin = open("input/02_input.txt")

s = input()
stack = []
cnt = 0

for i in range(len(s)):
    if s[i] == '(':
        stack.append(s[i])
    else: # ) 닫는 괄호이면
        stack.pop()
        if s[i-1] == '(':
            cnt += len(stack)
        else: # ) 닫는 괄호이면
            cnt += 1

print(cnt)
