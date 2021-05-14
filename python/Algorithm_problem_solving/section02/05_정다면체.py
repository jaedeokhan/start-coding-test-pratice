import sys
sys.stdin = open("input/05_input.txt", "rt")

N,M = map(int, input().split())
dice = [0 for _ in range(N+M)]

for i in range(1, N+1):
    for j in range(1, M+1):
        dice[i+j-1] += 1

for idx in range(len(dice)):
    if dice[idx] == max(dice):
        print(idx+1, end=' ')
