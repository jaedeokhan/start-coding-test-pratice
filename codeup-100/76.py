# 76, 문자 1개 입력받아 알파벳 출력하기
input_ord = ord(input())
a_ord = ord('a')


while(input_ord >= a_ord):
    print(chr(a_ord), end=' ')
    a_ord += 1

