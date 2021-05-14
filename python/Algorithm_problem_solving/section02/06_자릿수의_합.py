import sys

sys.stdin = open("input/06_input.txt", "r")

def digit_sum(x):

    result = 0
    
    for i in str(x):
        result += int(i)

    return result

N = int(input())
a = list(map(int, input().split()))
max = -2147000000
res = 0


for x in a:
    total = digit_sum(x)
    if total > max:
        max = total
        res = x

print(res)

