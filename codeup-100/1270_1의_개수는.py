n = int(input())
cnt = 0

for i in range(1, n+1):
    if(i % 10 == 1):
        cnt += 1
        print(i, end=' ')

print(cnt)
