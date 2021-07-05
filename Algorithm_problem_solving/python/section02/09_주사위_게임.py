import sys
sys.stdin = open("input/09_input.txt", "rt")

n = int(input())
res = 0
max_v = -2147000000

for i in range(n):
    a,b,c = map(int, input().split())
    tmp = 0
    
    if a == b == c:
        tmp = 10000 + a * 1000
    elif a == b or b == c:
        tmp = 1000 + b * 100
    elif a == c:
        tmp = 1000 + a * 100
    elif a != b != c: # 모두 다르면
        max_a = a
        if b > max_a:
            b = max_a

        if c > max_a:
            c = max_a
    
        tmp = max_a * 100

    if tmp > max_v:
        max_v = tmp

print(max_v)
        

   
