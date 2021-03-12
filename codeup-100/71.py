# 71 : 평가 입력받아 다르게 출력하기
evaluation = input()

result = 'best!!!'

if(evaluation == 'A'):
    result = 'best!!!'
elif(evaluation == 'B'):
    result = 'good!!'
elif(evaluation == 'C'):
    result = 'run!'
elif(evaluation == 'D'):
    result = 'slowly~'
else:
    result= 'what?'

print(result)
