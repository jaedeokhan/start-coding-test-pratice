import sys
sys.stdin = open("input/10_input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))
score = 0
plus = 0

for i in range(len(a)):

    if a[i] == 1:
        score = score + plus + 1
        plus += 1
    elif a[i] == 0:
       # 가산점 초기화
       plus = 0

print(score)

