# 98, 바둑알 십자 뒤집기
# 해당 위치의 모든 가로줄 돌의 색을 반대(1 -> 0, 0 -> 1)로 바꾼 후,
# 다시 그 위치에 있는 모든 세로줄 돌의 색을 반대로 바꾸는 것이다.
# 해당 위치를 제외한 모든 가로줄, 세로줄 색을 반대로 바꾼다.
import sys

sys.stdin = open("input/98_input.txt", "rt")

d = [list(map(int, input().split())) for _ in range(19)]
n = int(input())

for i in range(n):
    row, col = map(int, input().split())
    # 10 10
    # 12 12
    row = row - 1
    col = col - 1
    for j in range(len(d)):
    
        if d[row][j] == 0:
            d[row][j] = 1
        else:
            d[row][j] = 0

        if d[j][col] == 0:
            d[j][col] = 1
        else:
            d[j][col] = 0
        

      
for i in range(len(d)):
    for j in range(len(d)):
        print(d[i][j], end=' ')
    print()
