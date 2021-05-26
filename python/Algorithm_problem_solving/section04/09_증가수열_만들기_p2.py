import sys
#sys.stdin = open("input/09_input.txt", "r")

# sys.stdin = open("input/09_input_1.txt", "r")

# sys.stdin = open("input/09_input_2.txt", "r")

sys.stdin = open("input/09_input_3.txt", "r")

n = int(input())
a = list(map(int, input().split()))

direction = 'L'
ed = a.pop(0)
print(a)

while a: # a리스트가 존재할때까지 
    print(a)
    # 오른쪽 왼쪽 값이 ed보다 작으면 증가수열 끝
    if a[-1] < ed and a[0] < ed:
        break
    elif a[-1] > ed and a[0] > ed:

        if a[-1] > ed:
            # 오른쪽 값이 더 가까우면
            if abs(a[-1] - ed) < abs(a[0] - ed):
            
                ed = a.pop()
                direction += 'R'
            
            # 오른쪽 값이 더 가까우면
            else:

                ed = a.pop(0)
                direction += 'L'
    elif a[-1] > ed and a[0] < ed:
        
        ed = a.pop()
        direction += 'R'
    elif a[0] > ed and a[-1] < ed:

        ed = a.pop(0)
        direction += 'L'

print(direction)

