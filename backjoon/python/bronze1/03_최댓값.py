import sys

value = [int(sys.stdin.readline().strip()) for i in range(9)]
largest = -21480000
index = 0

for i, v in enumerate(value):
    if v > largest:
        largest = v
        index = i + 1

print(largest)
print(index)
