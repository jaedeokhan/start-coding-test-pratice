import sys
sys.stdin = open("input/01_input.txt", "rt")
n = int(input())

for i in range(n):
    s = input()
    s = s.upper() # 대소문자를 가리지 않는다. 여기서는 모두 대문자로 변경
    
    if s == s[::-1]:
        print("#%d YES" %(i+1))
    else:
        print("#%d NO" %(i+1))
    



