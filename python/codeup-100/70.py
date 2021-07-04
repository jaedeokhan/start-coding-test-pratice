# 점수 입력받아 평가 출력하기
score = int(input())

evaluation = 'A'

if(score <= 100 and score >= 90):
    evaluation = 'A'
elif(score <= 89 and score >= 70):
    evaluation = 'B'
elif(score <= 69 and score >= 40):
    evaluation = 'C'
else:
    evaluation = 'D'
    
print(evaluation)
