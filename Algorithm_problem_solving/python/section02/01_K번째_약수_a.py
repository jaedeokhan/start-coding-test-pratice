import sys
sys.stdin = open("input/01_input.txt", "rt")

n, k = map(int, input().split())
cnt = 0

for i in range(1, n+1):
    if n % i == 0:
        cnt += 1

    if cnt == k: 
        print(i)
        break

# for else구문
# for문의 break가 안걸리면 else구문 실행
# cnt == k가 안걸릴 때, 즉 약수의 갯수(n)이 k보다 작으면
else:
    print(-1)
    

