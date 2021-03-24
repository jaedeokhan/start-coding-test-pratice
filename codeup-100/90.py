# 90, 수 나열하기
# 수열(seqences)
# 1 4 7 10 13 16 19 22 25..
# 각 숫자 3을 더하는
# 등차(차이가 같다) => 등차수열(arithmetic progression/sequence)
# 입력 : 시작 값(a), 등차의 값(d), 몇 번째 수인지(n)
a, d, n = map(int, input().split())
a1= a
d1 = d
n1 = n
cnt = 1

# while문을 사용해서 구현
while True:
    if(cnt == n):
        print(a)
        break
    a += d
    cnt += 1

# for문을 사용해서 구현
for i in range(2, n1 + 1):
    # 2 3 4 5
    a1 += d1

print(a1)
    
    
