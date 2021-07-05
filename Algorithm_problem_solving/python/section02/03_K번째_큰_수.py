import sys
sys.stdin = open("input/03_input.txt", "rt")

from itertools import combinations

N, K = map(int, input().split())
result = []

card = list(map(int, input().split()))
# itertools의 combinations를 이용해서 3개를 선택할 수 있는 모든 경우의 수를
# 리스트로 감사서 picked_card 변수에 담아줍니다
picked_card = list(combinations(card,3))

# 3개 숫자를 선택한 모든 경우의 수의 리스트를 
# for문을 돌려서 인덱싱으로 3개를 더해서 result에 appned()로 더해줍니다.
for p_c in picked_card:
    result.append(p_c[0] + p_c[1] + p_c[2])
    
# set함수를 통해서 result의 중복을 제거 후 
# sorted()의 reverse=True로 내림차순 정렬(큰 값 => 작은 값)
result = sorted(set(result), reverse=True)


print(result[K-1])

