import sys
sys.stdin = open("input/08_input.txt", "r")

n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
m = int(input())

for i in range(m):
    h, t, k = map(int, input().split())
    
    # 왼쪽
    if t == 0:
        for _ in range(k):
            a[h-1].append(a[h-1].pop(0))

    # 오른족
    else:
        for _ in range(k):
            # insert(index, value) => 0번 자리에 a[h-1]행의 맨 오른쪽의 값을 추가
            a[h-1].insert(0, a[h-1].pop())

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
