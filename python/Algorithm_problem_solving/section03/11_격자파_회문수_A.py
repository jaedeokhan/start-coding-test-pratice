import sys
sys.stdin = open("input/11_input.txt", "r")

board = [list(map(int, input().split())) for _ in range(7)]
cnt = 0

# 행 0,1,2로 접근
for i in range(3):
    for j in range(7):
        tmp = board[j][i:i+5]
        
        if tmp == tmp[::-1]:
            cnt += 1
        
        # 열 
        for k in range(2):
            # 회문이 아닌경우
            if board[i+k][j] != board[i+5-k-1][j]:
                break
        else:
            cnt += 1


print(cnt)
