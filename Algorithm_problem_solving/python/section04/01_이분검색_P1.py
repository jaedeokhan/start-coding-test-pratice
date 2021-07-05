import sys
sys.stdin = open("input/01_input.txt", "r")

n, m = map(int, input().split())
a = list(map(int, input().split()))

a.sort()

for i in range(len(a)):
    if a[i] == m:
        print(i+1)
        break
