import sys
sys.stdin = open("input/05_input.txt", "rt")

n,m = map(int, input().split())
cnt = [0] * (n+m+3) # 조금 더 넉너가게 고냥 3을 더해준다.
max = -2147000000

for i in range(1, n+1):
    for j in range(1, m+1):
        cnt[i+j] += 1

for i in range(n+m+1):
    if cnt[i] > max:
        max = cnt[i]
        
for i in range(n+m+1):
    if cnt[i] == max:
        print(i, end=' ')
