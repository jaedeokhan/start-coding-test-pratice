# 17496번, 스타후르츠
# 문제 :진수는 작물 중에서도 '스타후르츠' 라는 작물을 제일 좋아합니다.
# 진수는 올해 여름 동안 얼마나 많은 돈을 벌 수 있을까요?
# 입력 : 첫 번째 줄에 여름의 일수 N(2 <= N <= 90), 스타후르츠가 자라는데 걸리는 일 수 T(1 <= T <= N-1)
# 스타후르츠를 심을 수 있는 칸의 수 C(1 <= C <= 300), 스타후르츠 개당 가격 정수 P(1 <= P <= 1000)
# 출력 : 첫 번째 줄에 진수가 여름 동안 스타후르츠를 팔아 벌 수 있는 수익을 출력합니다.
# 7 3 2 750
# 3000
summer_day, grow_day, c, price = map(int, input().split())

result = summer_day // grow_day
diff = summer_day % grow_day

if diff != 0:
    result = result * c * price 
else:
    result = (result-1) * c * price

print(result)

# 다른 사람의 풀이
# summer_day가 7, 60이였는데 ((7-1) // 3) => 2, ((60-1) // 10) => 5
print((summer_day - 1) // grow_day * c * price)
