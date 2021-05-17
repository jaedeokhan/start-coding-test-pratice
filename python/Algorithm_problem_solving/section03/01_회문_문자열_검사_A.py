import sys
sys.stdin = open("input/01_input.txt", "rt")
n = int(input())

for i in range(n):
    s = input()
    s = s.upper() # 대소문자를 가리지 않는다. 여기서는 모두 대문자로 변경
    
    size = len(s)

    for j in range(size // 2):
        if s[j] != s[-1-j]:
            print('#%d NO' %(i+1))
            break
    else: # for-else 구문은for문에서 break문을 만나지 않으면 실행이 된다.
        print('#%d YES' %(i+1))
    
    


