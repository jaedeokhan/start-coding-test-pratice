import sys
sys.stdin = open("input/02_input.txt", "r")

def Count(len):
    
    cnt = 0
    
    print(len, end=' ')

    for x in Line:
        cnt += (x // len)
        print(cnt, end=' ')
    print()
    
    return cnt

k, n = map(int, input().split())
Line = []
res = 0
largest = 0

for i in range(k):
    tmp = int(input())
    Line.append(tmp)
    largest = max(largest, tmp)

lt = 1
rt = largest

while lt <= rt:
    mid = (lt + rt) // 2
    
    print(lt, rt, mid, end=' ')

    if Count(mid) >= n:
        res = mid
        lt = mid + 1

    else:
        rt = mid - 1

print(res)
