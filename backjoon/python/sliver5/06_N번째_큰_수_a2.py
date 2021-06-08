import sys
sys.stdin = open("input/06_input.txt", "r")

t = int(input())

for i in range(t):
    print(sorted(list(map(int, input().split())))[-3])
