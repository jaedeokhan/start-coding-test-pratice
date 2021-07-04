# 79, 짝수 합 구하기
i1 = int(input())
even = 0

for i in range(1, i1 + 1):
    if(i % 2 == 0):
        even += i

print(even)
