import sys
# sys.stdin = open("input/10_input.txt", "r")
sys.stdin = open("input/10_input_3.txt", "r")
# sys.stdin = open("input/10_input_1.txt", "r")

board = [list(map(int, input().split())) for _ in range(9)]
step = [
        (-1, 0), (-1, 1), (0, 1), (1,1),
        (1, 0), (1, -1), (0, -1), (-1,-1) 
        ] 

def check_board(board):
    
    for i in range(len(board)):
        row_check = [0] * 9
        col_check = [0] * 9
        for j in range(len(board)):
            row_check[board[i][j]-1] = 1
            col_check[board[j][i]-1] = 1
        
        if 0 in row_check:
            return False

        if 0 in col_check:
            return False
    

    for i in range(1, 8, 3):
        for j in range(1, 8, 3):
            row_col_check = [0] * 9
            row_col_check[board[i][j]-1] = 1
            for s in step:
                row_col_check[board[i+s[0]][j+s[1]]-1] = 1
            
            if 0 in row_col_check:
               return False

    return True
            


if check_board(board):
    print('YES')
else:
    print('NO')

