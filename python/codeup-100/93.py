# 93, 함께 문제 푸는 날 
# 같은 날 동시에 가입한 3명의 사람들이 다시 모두 함께 문제를 풀게 되는 그날은 언제인가?
# 입력 : 3 7 9
# 출력 : 63

i1, i2, i3 = map(int, input().split())
day = 1
day1 = day

while(day % i1 != 0 or day % i2 != 0 or day % i3 != 0):
    print(f'{day} % {i1} != {day % i1}  or {day} % {i2} != {day % i2} or {day} % {i3} != {day % i3}')
    day += 1

print(day)

