# 96, 이상한 출석 번호 부르기3
# 랜덤 번호중에 가장 작은 값 출력
# 입력 : 번호(n), 랜덤 번호(k)
# 출력 : 출석을 부른 번호 중에 가장 빠른 번호를 출력
number = int(input())
random = list(map(int, input().split()))
min = -2147000

for i in range(number - 1):
     if(i > min):
         min = i
