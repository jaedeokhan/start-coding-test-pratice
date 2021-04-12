# 2480번, 주사위 세개
# 문제 : 같은 눈이 3개가 나오면 10,000원+(같은 눈)*1,000원의 상금을 받게 된다.
# 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)*100원의 상금을 받게 된다.
# 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)*100원의 상금을 받게 된다.
# 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
# 입력 : 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
# 출력 : 첫째 줄에 게임의 상금을 출력 한다.

a, b, c = map(int, input().split())

data = [a,b,c]

if a == b and b == c and a == c:
    print(10000 + a * 1000)
elif a == b:
    print(1000 + a * 100)
elif b == c:
    print(1000 + b * 100)
elif a == c:
    print(1000 + a * 100)
elif a != b and b != c and a != c:
    data.sort()
    print(data[2] * 100)
    
        
    

