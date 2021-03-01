# 정수 3개 입력받아 합과 평균 출력하기
i1, i2, i3 = map(int, input().split())
sum = i1 + i2 + i3
avg = sum / 3
print(sum, round(avg, 2), sep=" ")
