# 76, 문자 1개 입력받아 알파벳 출력하기
char = input()
diff =  1 + (ord(char) - ord('a'))

while(diff != 0):
    print( chr(ord(char) - diff) , end=' ')
    diff -= 1
    

