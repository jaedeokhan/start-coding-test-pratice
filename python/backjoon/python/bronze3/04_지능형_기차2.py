# [bronze3][2460번] 지능형 기차2
# 1. 내린 사람 out, 탄 사람 in을 정수로 입력받는다.
# 2. total, largest 로 가장 많이 탄 인원을 출력할 변수 설정
# 3. for문을 10번 반복하면서 내린 사람 out, 탄 사람 in을 정수로 입력받는다.
# 3-1. total = total + in - out
# 3-2. if total > largest 보다 크다면 가장 많이 탄 곳을 저장
# 4. 가장 많이 탄 largest를 출력
total = 0
largest = -2148000

for i in range(10):
    out, come = map(int, input().split())
    total += come - out
    if total > largest:
        largest = total

print(largest)
