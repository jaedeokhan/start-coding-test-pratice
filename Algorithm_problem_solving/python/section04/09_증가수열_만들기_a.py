import sys
sys.stdin = open("input/09_input.txt", "r")

n = int(input())
a = list(map(int, input().split()))

direct = ''
last = 0
lt = 0
rt = n - 1
tmp = []

while lt <= rt:

    if a[lt] > last:
        tmp.append( (a[lt], 'L') )
    
    if a[rt] > last:
        tmp.append( (a[rt], 'R') )

    # 정렬
    tmp.sort()

    if len(tmp) == 0:
        break
    else:
        direct += tmp[0][1]
        last = tmp[0][0]
        if tmp[0][1] == 'L':
            lt += 1
        else:
            rt -= 1
    
    tmp.clear()

print(len(direct))
print(direct)
