# 83, 16진수 구구단 출력하기
i1 = int(input(), 16)

for i in range(1, 16):
    print('%X'%i1 + '*' + '%X'%i + '=' + '%X'%(i1 * i) )    
    

