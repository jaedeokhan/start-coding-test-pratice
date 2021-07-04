# [sliver4][1978번] 소수 찾기
# 1. 정수의 갯수인 N과 N만큼의 정수 num_list를 입력 받는다. count 변수도 만든다.
# 2. num_list를 for문을 돌린다.
# 2-1. def check_prime(x): 함수를 만들어서 True, False를 반환한다. True이면 count += 1 한다.
# 3. 소수의 갯수인 count를 출력한다.
import sys
sys.stdin = open("input/01_input.txt", "r")

def check_prime(x):
    
    if x == 1:
        return False
    
    for i in range(2, x):
        if x % i == 0:
            return False  
            
    return True

num = int(input())
num_list = list(map(int, input().split()))
count = 0

for n in num_list:
    if check_prime(n):
        count += 1

print(count)
