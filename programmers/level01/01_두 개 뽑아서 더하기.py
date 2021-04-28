import sys

sys.stdin = open("input/01_input.txt", "rt")

numbers = list(map(int, input().split()))
answer = []

for i in range(len(numbers) - 1):
    for j in range(i+1, len(numbers)):
        answer.append(numbers[i]+numbers[j])

print(sorted(set(answer)))
