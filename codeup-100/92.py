# 92, 수 나열하기3
# 1-1 3-5 11-21 43 ...
# 1부터 시작해 이전에 만든 수에 -2를 곱한 다음 1을 더해 다음수로 만든 수열
# 1  => (1 * -2) + 1 => -1
# -1 => (-1 * -2) + 1=> 3
# 3  => (3 * -2) + 1 => -5
# -5 => (-5 * -2) + 1 => 11
# 11 => (11 * -2) + 1 => -21
# 입력 : 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 정수(n)
a, m, d, n = map(int, input().split())
a1 = a
m1 = m
d1 = d
n1 = n
cnt = 1

while True:
    if(cnt == n):
        print(a)
        break
    a = (a * m) +d
    cnt += 1

for i in range(1, n1):
    a1 = a1 * m1 + d1
    

print(a1)
