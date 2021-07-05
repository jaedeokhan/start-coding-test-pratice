import sys
sys.stdin = open("input/01_input.txt", "r")

n, m = map(int, input().split())
a = list(map(int, input().split()))
index = 0


for i in range(len(a) - 1):   
    smallest = 9999
    for j in range(i, len(a)):
        if smallest > a[j]:
            smallest = a[j]
            index = j
    a[i], a[index] = a[index], a[i]

print(a)

for i in range(len(a)):
    if a[i] == m:
        print(i+1)
        break
