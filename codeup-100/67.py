# 정수 3개를 입력받아 짝/홀 출력하기
i1 = list(map(int, input().split()))

for i in i1:
    even_odd = "even" if (i%2==0) else "odd"
    print(even_odd)
