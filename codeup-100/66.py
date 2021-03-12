# 정수 3개를 입력받아 짝수만 출력하기
a = list(map(int, input().split()))

for i in a:
    if(i % 2 == 0):
        print(i)
