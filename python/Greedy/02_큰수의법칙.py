import sys

sys.stdin = open('../input/Greedy/02_input.txt', 'rt')

n, m, k = map(int, input().split())
data = list(map(int, input().split()))

result = 0
data.sort()
first, second = data[n - 1], dat a[n - 2] # 1번째로 큰수, 2번째로 큰수         
# m 번 동안 반복, 가장 큰수와 두 번째로 큰수
# 가장 큰수 k번 더하고
# 두 번째로 큰수 1번 더하고
while True:
    for i in range(k):
        if(m == 0):
            break
        result += first
        m -= 1
    if(m == 0):,,
        break
    result += second
    m -= 1
    
print(result)
      
