# 주원이는 월,수,금,일 아르바이트를 간다.
# 다음은 요일의 순서이다.
# 1.월 2.화 ... 7.일
# 요일의 번호가 주어지면 아르바이트 날이면 "oh my god", 아니면 "enjoy" 출력
day = int(input())

result = "oh my god" if day == 1 or day == 3 or day == 5 or day == 7 else "enjoy"

print(result)
