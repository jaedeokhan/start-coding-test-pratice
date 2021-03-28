import sys

sys.stdin = open("input/100_input.txt", "rt")

map_d = [list(map(int, input().split())) for _ in range(10)]

x, y = 1,1

while True:

    if map_d[x][y] == 2:
        map_d[x][y] = 9
        break
    elif map_d[x+1][y] == 1 and map_d[x][y+1] == 1:
        map_d[x][y] = 9
        break
    
    map_d[x][y] = 9
    
    if map_d[x][y+1] == 1:
        x += 1
    elif map_d[x+1][y] == 1:
        y += 1
    else:
        y += 1

for i in range(len(map_d)):
    for j in range(len(map_d)):
        print(map_d[i][j], end=' ')
    print()
