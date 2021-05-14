import sys
sys.stdin = open("input/04_input.txt", "rt")

N = int(input())
student = list(map(int, input().split()))
# round는 round_half_even 방식을 택한다.
# a = 4.500 |  print(round(a)) 
# 하프지점에 있으면 짝수지점으로 올라간다. 즉, 답이 5가 아니라 4가 나온다.
# avg = round(sum(student) / N) # 학생들의 평균, round()로 소숫점 1자리에서 올림
# round를 사용하지 않고 0.5를 더해서 int()형 변환해서 해결
avg = int(sum(student) / N + 0.5)
min = 21470000

for idx, x in enumerate(student):
    tmp = abs(x - avg) # 평균값과 각 학생의 차이

    if tmp < min:
        min = tmp
        score = x
        res = idx + 1
    elif tmp == min:
        if x > score:
            score = x
            res = idx + 1

print(avg, res)
