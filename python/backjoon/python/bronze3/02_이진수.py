# 1. 테스트 케이스 개수 T를 입력받는다.
# 2. t의 갯수만큼 for문을 반복한다.
# 2-1. 양의 정수 n을 입력받고, bin()으로 이진수화해서 [:2]까지 binary 문자열 변수에 저장한다.
# 2-2. binary를 for문을 돌려서 1이 존재하는 인덱스를 end=' '를 이용해서 한칸 씩 띄워서 출력한다.
t = int(input())

for i in range(t):
    n = int(input())
    binary = bin(n)[2:]
    
    for i,b in enumerate(binary[::-1]):
        if b == '1':
            print(i, end=' ')
    print()
