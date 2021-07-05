import sys
sys.stdin = open('input/01_input.txt', 'rt')

N,K = map(int, input().split())
cnt = 0

for i in range(1, N+1): 

    if N % i == 0:
        cnt += 1

    if cnt == K: # K번째 약수라면
        print(i)
        break
    
# cnt == k가 안걸릴 때, 즉 약수의 갯수(n)이 k보다 작으면
if K > cnt:
    print(-1)
    
