# [sliver4][1978번] 소수 찾기
# 에라토스테네스 체 사용
# 1. 정수의 갯수인 n과 n개의 갯수만큼 num_list에 입력 받는다.
# 2. check 리스트 변수에 [0] * max(num_list)을 곱해서 0으로 찬 배열을 만들어준다.
# 3. 에라토스테네스의 체 방법으로 소수이면 1을 채운다.
# 4. num_list를 for문 돌려서 check[n] 인덱싱을 접근해서 total에 복합연산을 한다.
import sys
sys.stdin = open("input/01_input.txt", "r")

n = int(input())
num_list = list(map(int, input().split()))
largest = max(num_list) + 1
check = [0] * largest
total = 0

for i in range(2, largest):
    # 0과 -1은 소수가 아니다.
    if check[i] == 0 or check == -1:
        # 소수인 수는 1을 넣어준다.
        check[i] = 1
        for j in range(i+i, largest, i):
            check[j] = -1

for n in num_list:
    if check[n] == 1: # 소수이면
        total += check[n]

print(total)
