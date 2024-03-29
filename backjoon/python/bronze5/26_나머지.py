# 10430번
# 문제 : 나머지
# (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
# (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
# 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오
# 입력 : 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
# 출력 : 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C,
# 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
# 5 8 4
a,b,c = map(int, input().split())

# (5+8) % 4 => 13 % 4 => 1
print((a+b) % c)

# (5%4) + (8%4) % 4 => 1 + 0 % 4 => 1
print(((a%c) + (b%c)) %c)

# 5 * 8 % 4 => 40 % 4 => 0
print((a*b) %  c)

# (5%4) * (8%4) % 4 => 1 * 0 % 4 => 0
print(((a%c) * (b%c)) % c)
