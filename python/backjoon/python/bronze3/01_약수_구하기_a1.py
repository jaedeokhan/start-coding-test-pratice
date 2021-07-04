# 다른 사람의 풀이 1
# 리스트 내포식을 이용하고, try-catch문으로 k가 더 크면 index를 초과하기에 0을 출력하고, 정상적인 경우는  k-1번째로 출력
n,k = map(int, input().split())
x = [i for i in range(1, n+1) if n % i == 0]

try:print(x[k-1])
except:print(0)
