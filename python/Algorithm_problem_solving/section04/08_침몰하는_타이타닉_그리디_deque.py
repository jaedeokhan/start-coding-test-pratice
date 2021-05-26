import sys
from collections import deque
sys.stdin = open("input/08_input.txt", "r")

# 리스트 방식에서는 만약 [1,2,3,4,5] 값이 존재하는데 a.pop(0)을 한다면 0번 인덱스의 1을 삭제하고 2,3,4,5의 인덱스를 하나씩 당긴다.
# 이러한 리스트 방식을 조금 더 효율적인 방식으로는 파이썬 큐 라이브러리인 deque를 사용해서 a.popleft()를하면 0번 인덱스를 삭제하고, 0번의 포인터 변수가 1번 인덱스인 2를 가르키게 된다.

n, limit = map(int, input().split())
p = list(map(int, input().split()))
p.sort()
p = deque(p) # deque <= list
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
        p.popleft()
        p.pop()
        cnt += 1

print(cnt)

