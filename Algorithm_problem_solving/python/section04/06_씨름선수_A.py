import sys
sys.stdin = open("input/06_input_1.txt", "r")

n = int(input())
body = []
for i in range(n):
    h, w = map(int, input().split())
    body.append((h, w))

# 키를 기준으로 내림차순 정렬
body.sort(key = lambda x : x[0], reverse=True)

largest = 0
cnt = 0

# 키는 앞의 값이 항상크니, 각각의 항목을 돌면서 몸무게가 더 큰지 확인하고 체크한다
for x, y in body:
    if y > largest:
        cnt += 1 
        largest = y

print(cnt)
