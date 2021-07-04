# 정수 3개를 입력받아 가장 작은 값 출력하기
# 1 2 3
a,b,c = map(int, input().split())
min = (a if a<b else b) if ( (a if a<b else b) <c) else c
    
print(min)
