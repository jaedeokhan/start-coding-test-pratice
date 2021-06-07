# 1. 정수의 갯수 n을 입력받고, 다음 줄에 n개의 정수를 a 리스트로 입력받는다.
# 2.

n = int(input())
a = list(map(int, input().split()))

largest = -2148000
smallest = 2148000

for i in a:
    if i > largest:
        largest = i
    if i < smallest:
        smallest = i

print(smallest, largest)
