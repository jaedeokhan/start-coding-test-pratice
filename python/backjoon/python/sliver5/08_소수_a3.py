# [sliver5][2581번] 소수
# 1. m과 n을 입력받는다.
# 2. check리스트를 [0] * n-m 숫자만큼만든다.
# 3. for문을 m부터 n+1까지 돌린다.
# 3-1. 소수이면 total_list에 추가
import sys
sys.stdin = open("input/08_input.txt", "r")

m = int(input())
n = int(input())
check = [0] * (n+1)
total = []

for i in range(2, n+1):
    # 0과 -1은 소수가 아니다.
    if check[i] == 0 or check == -1:
        # 소수인 수는 1을 넣어준다.
        check[i] = 1
        for j in range(i+i, n+1, i):
            check[j] = -1

for i in range(m, n+1):
    if check[i] == 1:
        total.append(i)
        
if len(total) == 0:
    print(-1)
else:
    print(sum(total))
    print(total[0])
