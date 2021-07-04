# 태어난 해, 월, 일을 입력받아 사주팔자를 보는 프로그램을 작성
# 입력  : 세 수(년, 월, 일)
# (년 - 월 + 일)에 마지막 숫자가 0이면 "대박", 그렇지 않으면 "그럭저럭"
# (1996 - 10 + 8) => 1994

year, month, day = map(int, input().split())

result = year - month + day
message = "대박" if result % 10 == 0 else "그럭저럭"

print(message)

