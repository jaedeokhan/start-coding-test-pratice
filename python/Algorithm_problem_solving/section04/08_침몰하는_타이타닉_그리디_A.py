import sys
sys.stdin = open("input/08_input.txt", "r")

n, limit = map(int, input().split())
p = list(map(int, input().split()))
p.sort()
cnt = 0

while p: # p가 비어있지 않을때 까지
    
    if len(p) == 1: # 1명 남았을때 처리
        # 한 명이니 pop()을 안하고 나가도 무방하다
        cnt += 1
        break
    
    if p[0] + p[-1] > limit:
        p.pop()
        cnt += 1
    else:
        p.pop(0)
        p.pop()
        cnt += 1

print(cnt)

