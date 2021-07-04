# [bronze2][2309번] 일곱 난쟁이
# 1. 9개 줄의 난쟁이 키의 값을 배열로 받는다.
# 2. total변수에 난쟁이 9마리의 합을 초기화한다.
# 3. 이중 for문을 i = 0 to 8까지, 이차 for문에 j는j = i to 9까지 반복한다.
# 3-1. if total == total - a[i] - a[j]: 같으면 a[i]와 a[j]를 제거하고 break
# 4. 리스트를 sort() 후 한 줄씩 출력
import sys

sys.stdin = open("input/05_input.txt", "r")

height = [int(sys.stdin.readline().strip()) for i in range(9)]
answer = height[:]
total = sum(height)

for i in range(8):
    for j in range(i+1, 9):
        if (total - height[i] - height[j]) == 100:
            answer.remove(height[i])
            answer.remove(height[j])
            break
    if len(answer) < 9:
        break

answer.sort()

for a in answer:
   print(a)
