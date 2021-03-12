# 정수 1개 입력받아 분류하기
int_value = int(input())

if(int_value < 0):
    if(int_value % 2 ==0):
        print('A')
    else:
        print('B')
else:
    if(int_value % 2 == 0):
        print('C')
    else:
        print('D')
