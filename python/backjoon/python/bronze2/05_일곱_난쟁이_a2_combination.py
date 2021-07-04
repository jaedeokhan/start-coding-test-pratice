# [bronze2][2309번] 일곱 난쟁이
import sys
from itertools import combinations
sys.stdin = open("input/05_input.txt", "r")

height = [int(sys.stdin.readline().strip()) for i in range(9)]
answer = []

for combi in list(combinations(height, 7)):
    if sum(combi) == 100:
        answer =(sorted(combi))
        break

for a in answer:
    print(a)
