import sys
sys.stdin = open("input/06_input.txt", "r")

n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
max = -2147000000
left = 0
right = 0

matrix_sum = []

for i in range(len(a)):
    sum = 0
    for j in range(len(a)):
        sum += a[i][j]
    matrix_sum.append(sum)
    
    sum = 0
    for j in range(len(a)):
        sum += a[j][i]
    matrix_sum.append(sum)

for i in range(len(a)):
    left += a[i][i]
    right += a[i][len(a)-i-1]

matrix_sum.append(left)
matrix_sum.append(right)

for x in matrix_sum:
    if x > max:
        max = x

print(max)
