# 실수 2개를 입력받아 나눈 결과 계산하기
one_float, two_float = map(float, input().split())
division = one_float / two_float
print('%.3f'%division)
