# 정수 2개 입력받아 자동 계산하기
one_int, two_int = map(int, input().split())

sum = one_int + two_int
diff = one_int - two_int
multiple = one_int * two_int
quotient = one_int // two_int
division = one_int % two_int
last = one_int / two_int

print(sum)
print(diff)
print(multiple)
print(quotient)
print(division)
print(round(last, 2))
