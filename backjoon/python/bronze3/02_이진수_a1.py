# 다른 풀이
# python의 정수를 진수로 바꿔주는 bin()을사용하는 대신에 2로 소인수분해 방식으로 바꿔서 리턴하는 함수로 해결 
def convert_binary(x):
    
    binary = ''
    
    while x > 0:
        
        binary = binary + str(x % 2)
        x //= 2
        
    return binary 

t = int(input())

for i in range(t):
    n = int(input())
    binary = convert_binary(n)
    
    for i, b in enumerate(binary):
        if b == '1':
            print(i, end=' ')
    print()
