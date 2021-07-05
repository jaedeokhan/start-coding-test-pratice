import sys
# sys.stdin = open("input/10_input.txt", "r")
# sys.stdin = open("input/10_input_3.txt", "r")
sys.stdin = open("input/10_input_1.txt", "r")

board = [list(map(int, input().split())) for _ in range(9)]
step = [
        (-1, 0), (-1, 1), (0, 1), (1,1),
        (1, 0), (1, -1), (0, -1), (-1,-1) 
        ] 

def check_board(board):
    
    row_check = [0] * 9
    col_check = [0] * 9

    for i in range(len(board)):
        for j in range(len(board)):
            row_check[board[i][j]-1] += 1
            col_check[board[j][i]-1] += 1
    
    if len(set(row_check)) > 1:
        return False

    if len(set(col_check)) > 1:
        return False

    for i in range(1, 8, 3):
        for j in range(1, 8, 3):
            row_col_check = []
            row_col_check.append(board[i][j])
            for s in step:
                row_col_check.append(board[i+s[0]][j+s[1]])
            
            if len(set(row_col_check)) < 9:
            
               return False

    return True
            


if check_board(board):
    print('YES')
else:
    print('NO')

