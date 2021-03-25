# 100, 성실한 개미
# 오른쪽 움직이다 => 벽 => 아래쪽(가장 빠른길)
# 더 이상 움직일 수 없을때까지 오른쪽 또는 아래쪽 이동
# 상자의 구조 : 0(갈 수 있는 곳), 1(벽 또는 장애물), 2(먹이)
# 단, 맨 아래의 가장 오른쪽 도착 경우 즉 더 이상 움직 x, 먹이 찾은 경우 더 이상 이동하지 않고 머무름
# 미로는 모두 벽으로 되어있다. 즉 1
# 개미집은 반드시 (2,2)에 존재 => 개미는 (2,2)에서 출발
# 입력 : 10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다.
# 출력 : 성실한 개미가 이동한 경로를 9로 표시해 출력한다.

import sys

sys.stdin = open("input/100_input.txt", "rt")

map_d = [list(map(int, input().split())) for _ in range(10)]

now_x, now_y = 1,1

# 0 (갈 수 있는 곳)
# 1 (벽)
# 2 (먹이)
while True:
    if map_d[now_x][now_y] == 0: # 현재 갈 수 있으면
         map_d[now_x][now_y] = 9
         if map_d[now_x][now_y + 1] == 0: # 오른쪽으로 갈 수 있으면
             now_y += 1
         elif map_d[now_x][now_y + 1] == 1 and map_d[now_x + 1][now_y] != 1:
             now_x += 1
         elif map_d[now_x][now_y+1] == 2:
             map_d[now_x][now_y+1] = 9
             break
    else:
        break

for i in range(len(map_d)):
    for j in range(len(map_d)):
        print(map_d[i][j], end=' ')
    print()
