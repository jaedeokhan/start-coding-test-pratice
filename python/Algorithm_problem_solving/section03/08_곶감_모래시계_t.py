import sys
sys.stdin = open("input/08_input.txt", "r")

n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
m = int(input())

print(a[1][:])
