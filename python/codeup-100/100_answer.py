import sys

sys.stdin = open("input/100_input.txt", "rt")

map_d = [list(map(int, input().split())) for _ in range(10)]

now_x, now_y = 1,1

while True:
    if(map_d[now_x][now_y] == 2):
        map_d[now_x][now_y] = 9
        break
    elif map_d[now_x + 1][now_y] == 1 and map_d[now_x][now_y + 1] == 1:
        map_d[now_x][now_y] = 9
        break
    map_d[now_x][now_y] = 9
    if map_d[now_x][now_y + 1] == 1:
        now_x += 1
    elif map_d[now_x + 1][now_y] == 1:
        now_y += 1
    else: now_y += 1

for i in range(len(map_d)):
    for j in range(len(map_d)):
        print(map_d[i][j], end=' ')
    print()
        
