# 1. 시작과 끝인 s, e 변수를 입력 받는다.
# 2. e // 2 반틈까지의 숫자만큼 for문을 반복하고 이중 for문으로 반복해서 값을 넣는다.
# 3. s부터 e까지의 값을 슬라이싱한다.
s,e = map(int, input().split())
num = e // 2 + 1
seq = [i for i in range(1, num+1) for _ in range(i)]

print(sum(seq[s-1:e]))
