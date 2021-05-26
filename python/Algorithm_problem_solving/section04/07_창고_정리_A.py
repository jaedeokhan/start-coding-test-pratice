import sys
import time
sys.stdin = open("input/07_input.txt", "r")

# sys.stdin = open("input/07_input_5.txt", "r")


l = int(input())
box = list(map(int, input().split()))
m = int(input())
box.sort() # 미리 오름차순 정렬

for _ in range(m):
    box[0] += 1
    box[len(box)-1] -= 1 
    box.sort() # 제일 작은값과 큰값이 변경될 수 있으니 다시 정렬

print(box[-1] - box[0])
