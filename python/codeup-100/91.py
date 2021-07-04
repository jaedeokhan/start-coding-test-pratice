# 91, 수 나열하기2
# 2 6 18 54 162 486
# 2부터 시작해 이전에 만든 수에 3을 곱하는 수열
# 등비수열(geometric progression/sequence)
# 입력 : 시작 값(a), 등비(r), 몇 번째 수(n)
# 출력 : 몇 번째 수의 값
a, r, n = map(int, input().split())
cnt = 1

while True:
    if(cnt == n):
        print(a)
        break
    a *= r
    cnt += 1

