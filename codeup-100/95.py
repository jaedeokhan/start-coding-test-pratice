# 95, 이상한 출석 번호 부르기2
# 출석 번호를 n번 무작위로 불렀을 때, 부른 번호를 거꾸로 출력해 보자.
# 입력 : 10
#        10 4 2 3 6 6 7 9 8 5
# 출력 : 5 8 9 7 6 6 3 2 4 10
number = int(input())
random = list(map(int, input().split()))

for i in range(number - 1, -1, -1):
    print(random[i], end=' ')
