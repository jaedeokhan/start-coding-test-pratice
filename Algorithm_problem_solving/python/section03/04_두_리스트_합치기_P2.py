import sys
sys.stdin = open("input/04_input.txt", "rt")

# 내장 함수인 sort를 사용하는 o(n log n)이 아니라, o(n) 방법으로 해결

n = int(input())
a = list(map(int, input().split()))
m = int(input())
b = list(map(int, input().split()))
res = []
p1 = 0
p2 = 0


while True:

    if a[p1] <= b[p2]:
        res.append(a[p1])
        p1 += 1
        if p1 == len(a):
            break
    else:
        res.append(b[p2])
        p2 += 1


res = res + b[p2:]

for r in res:
    print(r, end=' ')
