import sys
sys.stdin = open("input/07_input.txt", "rt")
    
N = int(input())
ch = [0] * (N+1)
cnt = 0

for i in range(2, N+1):
    if ch[i] == 0: # 소수이면
       cnt += 1
       for j in range(i, N+1, i):
          ch[j] = 1

print(cnt)



