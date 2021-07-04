# 99, 설탕과자 뽑기
# 격자판 : 세로(h), 가로(w), 막대 개수(n), 막대 길이(l)
# 막대 놓는 방향(d: 가로 0, 세로 1)
# 막대 놓는 가장 왼쪽 또는 위쪽의 위치(x, y)
import sys

sys.stdin = open("input/99_input.txt", "rt")

h, w = map(int, input().split())
n = int(input())
# 5 5, 20 10
d = [ [0 for i in range(w)] for j in range(h)]

for i in range(n):
  l, c, x, y = map(int, input().split())
  x -= 1
  y -= 1
  for j in range(l):
    # 가로
    if(c == 0):
      d[x][y] = 1
      y += 1
    # 세로
    else:
      d[x][y] = 1
      x += 1

for i in range(h):
  for j in range(w):
    print(d[i][j], end=' ')
  print()
