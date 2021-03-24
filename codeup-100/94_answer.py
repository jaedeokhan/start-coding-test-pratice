number = int(input())
random = list(map(int, input().split()))
check = [0 for i in range(23)]

for i in range(number):
    check[(random[i]) - 1] += 1

for j in check:
    print(j, end=' ')
