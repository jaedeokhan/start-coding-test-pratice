import sys
sys.stdin = open("input/11_input.txt", "r")

def is_palindrome(row, col):
    
    cnt = 0

    if row == row[::-1]:
        cnt += 1

    if col == col[::-1]:
        cnt += 1


    return cnt


a = [list(map(int, input().split())) for _ in range(7)]
cnt = 0

for i in range(7):
    s = 0 
    e = 5
    for j in range(3):
        row_tmp = []
        col_tmp = []
        for k in range(s+j,e+j):
            row_tmp.append(a[i][k])
            col_tmp.append(a[k][i])
        cnt += is_palindrome(row_tmp, col_tmp)


print(cnt)
