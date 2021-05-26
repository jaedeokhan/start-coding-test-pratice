import sys
# sys.stdin = open("input/08_input.txt", "r")

sys.stdin = open("input/08_input_3.txt", "r")

n, m = map(int, input().split())
a = list(map(int, input().split()))

s = 0
e = n - 1
cnt = 0

# 오름차순 정렬
a.sort()

while len(a) > 0:
    

    # 2명이 배에 탈수 있는 경우
    if a[s] + a[e] <= m:
        
        if len(a) == 1:
            a.pop()
            cnt += 1
            break

        a.pop(0)
        a.pop()
        e -= 2

    else:
        a.pop()
        e -= 1

    cnt += 1

print(cnt)
        
