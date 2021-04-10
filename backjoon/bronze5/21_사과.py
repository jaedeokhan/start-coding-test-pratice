# Klaudia와 Natalia는 함께 10 개의 사과를 가지고 있지만
# Natalia보다 2 개 더 많은 사과를 가지고 있습니다
# 각 소녀는 몇 개의 사과를 가지고 있습니까?
a = int(input())
b = int(input())

print((a+b) // 2)
print((a-b) // 2)

# 윈도우 에러 => OSError: [WinError 6] 핸들이 잘못되었습니다
a1, b1 = map(int,open(0))
print((a1+b1) // 2, (a1-b1) // 2)

# (10 + 2) / 2 => 12 / 2 => 6
# (10 - 2) / 2 => 8 / 2  => 4
