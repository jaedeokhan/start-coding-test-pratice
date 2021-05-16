# 2751번
import sys

n = int(sys.stdin.readline())
data = [int(sys.stdin.readline().rstrip()) for i in range(n)]

for i in sorted(set(data)):
    print(i)
