import sys
sys.stdin = open("input/08_input.txt", "r")

n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
m = int(input())

for i in range(m):
    row, rot, cnt = map(int, input().split())
    # 왼쪽
    if rot == 0: 
        for _ in range(cnt):
            a[row-1] = a[row-1][1:] + a[row-1][:1]
    # 오른쪽
    else: # rot == 1
        for _ in range(cnt):
            a[row-1] = a[row-1][-1:] + a[row-1][:-1]

s = 0 
e = n
res = 0

for i in range(n):
    
    for j in range(s, e):
        res += a[i][j]

    if i < n // 2:
        s += 1
        e -= 1
    else:
        s -= 1
        e += 1

print(res)
