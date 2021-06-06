# 1. 약수의 갯수를 판단할 N과 몇 번째의 약수인지 판단할 K를 입력받는다.
# 2. 약수 갯수 판단할 cnt 변수를 만들고,  for문을 1부터 n+1까지 돌린다.
# 2-1. if n % i == 0이면, 즉 약수이면 cnt를 올린다. if cnt == k와 같다면 print(i) 출력 후 break한다.
# 2-2. else 이면 0을출력
n, k = map(int, input().split())
cnt = 0

for i in range(1, n+1):
    if n % i == 0:
        cnt += 1
    if cnt == k:
        print(i)
        break
else:
    print(0)
