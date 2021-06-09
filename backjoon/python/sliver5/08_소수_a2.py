# [sliver5][2581번] 소수
# 1. m, n 을 입력받는다.
# 2. for문을 m부터 n+1까지 돌린다.
# 2-1. def check_prime(x):를 통해서 소수이면 해당 정수를 리턴하고 total에 appned()한다.
# 3. 첫째 줄에 total의 sum 둘 째줄에 total의 최솟값을 출력
import sys
sys.stdin = open("input/08_input.txt", "r")

m = int(input())
n = int(input())
total_list = [i for i in range(m, n+1) if i != 1 and all(i % j for j in range(2, i))]

if len(total_list) == 0:
    print(-1)
else:
    print(sum(total_list))
    print(total_list[0])
