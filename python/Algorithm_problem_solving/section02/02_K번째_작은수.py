import sys
sys.stdin = open("input/02_input.txt", "rt")

T = int(input())

for t in range(T):
    N, s, e, k = map(int, input().split())
    result = sorted(list(map(int, input().split()))[s-1:e])

    print(f'#{t+1} {result[k-1]}')
    
