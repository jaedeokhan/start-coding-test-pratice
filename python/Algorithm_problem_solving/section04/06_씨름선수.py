import sys
sys.stdin = open("input/06_input_1.txt", "r")

# sys.stdin = open("input/06_input_2.txt", "r")

# sys.stdin = open("input/06_input_3.txt", "r")

n = int(input())

Info = []
for _ in range(n):
    h, w = map(int, input().split())
    Info.append((h, w))

# 키를 기준으로 오름차순 정렬
Info.sort(key = lambda x : x[0])
cnt = 0

for i in range(n - 1):   
    for j in range(i+1 ,n):
        if Info[i][1] < Info[j][1]:
            cnt += 1
            break

print(n - cnt)
            
    
