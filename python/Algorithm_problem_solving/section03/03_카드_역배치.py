import sys
sys.stdin = open("input/03_input.txt", "rt")

n = [i for i in range(1, 21)]

for i in range(10):
    a,b = map(int, input().split())

    size = len(n[a:b+1]) // 2
    
    for s in range(size):
        n[a+s-1], n[b-s-1] = n[b-s-1], n[a+s-1]        

for x in n:
    print(x, end=' ')
