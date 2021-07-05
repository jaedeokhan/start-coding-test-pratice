import sys
import time

# sys.stdin = open("input/07_input.txt", "r")
sys.stdin = open("input/07_input_5.txt", "r")

start_time = time.time()

l = int(input())
box = list(map(int, input().split()))
m = int(input())

for i in range(m):
    box[box.index(max(box))] -= 1
    box[box.index(min(box))] += 1

print(max(box) - min(box))
print(time.time() - start_time)
