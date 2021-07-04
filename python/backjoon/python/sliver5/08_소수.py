# [sliver5][2581번] 소수
# 1. m, n 을 입력받는다.
# 2. for문을 m부터 n+1까지 돌린다.
# 2-1. def check_prime(x):를 통해서 소수이면 해당 정수를 리턴하고 total에 appned()한다.
# 3. 첫째 줄에 total의 sum 둘 째줄에 total의 최솟값을 출력
import sys
sys.stdin = open("input/08_input.txt", "r")

def check_prime(x):
    
    if x == 1:
        return 0
    
    for i in range(2, x):
        if x % i == 0:
            return 0  
            
    return x

m = int(input())
n = int(input())
total = []

for i in range(m, n+1):
    
    if check_prime(i) != 0:
        total.append(check_prime(i))

if len(total) == 0:
    print(-1)
else:
    print(sum(total))
    print(total[0])
