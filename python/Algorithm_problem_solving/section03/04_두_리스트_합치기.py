import sys
sys.stdin = open("input/04_input.txt", "rt")

n = int(input())
a = list(map(int, input().split()))
m = int(input())
b = list(map(int, input().split()))
result = []

result = sorted(a+b)

for r in result:
    print(r, end=' ')
