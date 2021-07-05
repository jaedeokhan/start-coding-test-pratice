import sys
sys.stdin = open("input/10_input.txt", "r")

n = int(input())
a = list(map(int, input().split()))
origin = [0] * n

for i in range(n):
    for j in range(n):
        if a[i] == 0 and origin[j] == 0:
            origin[j] = i + 1
            break
        elif origin[j] == 0:
            a[i] -= 1

print(origin)
