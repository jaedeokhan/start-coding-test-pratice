# 72 : 월 입력받아 계절 출력하기
season = int(input())

result = 'spring'

if(season // 3 == 1):
    # 3 // 3 == 1
    # 4 // 3 == 1
    # 5 // 3 == 1
    result = 'spring'
elif(season // 3 == 2):
    # 6 // 3 == 2
    # 7 // 3 == 2
    # 8 // 3 == 2
    result = 'summer'
elif(season // 3 == 3):
    # 9 // 3 == 3
    # 10 // 3 == 3
    # 11 // 3 == 3
    result = 'fall'
else:
    result = 'winter'

print(result)
