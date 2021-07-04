# 94, 이상한 출석 번호 부르기1
number = int(input())
random = list(map(int, input().split()))
check = [0 for i in range(number)]

# 10번 loop
for i in range(1, number + 1):
    # random번호에 해당하는 check 인덱스 +1
    check[(random[i - 1]) - 1] += 1

for i in check:
    print(i, end=' ')
