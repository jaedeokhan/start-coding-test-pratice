import sys
sys.stdin = open("input/09_input.txt", "rt")

n = int(input())
res = 0

for i in range(n):
    tmp = input().split()
    tmp.sort() # 정렬해서 해결...
    a,b,c = map(int, tmp)

    if a == b and b == c:
        money = 10000 + a * 1000
    elif a == b or a == c:
        money = 1000 + a * 100
    elif b == c:
        money = 1000 + b * 100
    elif a != b and b != c:
        money = c * 100
 
    if money > res: # n명의 사람 중 가장 큰 값
        res = money

print(res)

