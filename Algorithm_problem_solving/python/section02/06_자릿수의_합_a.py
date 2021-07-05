import sys

sys.stdin = open("input/06_input.txt", "rt")

def digit_sum(x):
    sum = 0
    
    while x > 0:
        sum += x % 10
        x = x // 10

    return sum

n = int(input())
a = list(map(int ,input().split()))
max = -2147000000
answer = 0

for x in a:
    total = digit_sum(x)
    if total > max:
        max = total
        answer = x

print(answer)
