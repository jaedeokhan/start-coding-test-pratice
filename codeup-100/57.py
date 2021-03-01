# 참/거짓이 서로 다를 때에만 참 출력하기
i1, i2 = map(int, input().split())
print(bool((i1 and (not i2)) or ((not i1) and i2)))
