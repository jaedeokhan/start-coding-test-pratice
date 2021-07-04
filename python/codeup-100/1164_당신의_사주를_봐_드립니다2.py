# 태어난 해, 월, 일을 입력받아 사주팔자를 보는 프로그램
# 세 수(년,월,일)이 주어지면 (년+월-일)에 100자리 숫자가 짝수이면 "대박", 그렇지 않으면 "그럭저럭"
year, month, day = map(int, input().split())

result = ((year + month + day) % 1000) // 100

message = "대박" if result % 2 ==0 else "그럭저럭"

print(message)
