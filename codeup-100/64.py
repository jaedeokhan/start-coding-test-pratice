# 정수 2개를 입력받아 큰 값 출력하기
# Ternary Operator
# [true_value] ? if [condition] else [false_value]
i1, i2 = map(int, input().split())
big = i1 if (i1 > i2) else i2
print(big)
