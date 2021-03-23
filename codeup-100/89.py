# 89, 3의 배수는 통과
# 1부터 입력한 정수까지 1씩 증가시켜 출력
# 3의 배수인 경우는 출력 x
i1 = int(input())

for i in range(1, i1):
    if(i % 3 == 0):
        continue
    print(i, end=' ')
    i += 1
