import sys
sys.stdin = open("input/02_input.txt", "rt")

s = input()
s_num = ''
cnt = 0

for i in s:
    if i.isdigit():
        s_num += i

s_num = int(s_num.lstrip("0"))

for n in range(1, s_num+1):
    if s_num % n == 0:
        cnt += 1

print(f'{s_num}\n{cnt}')


