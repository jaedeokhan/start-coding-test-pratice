# 17256번, 달달함이 넘쳐흘러
# 문제 :냉장고에서 맛있게 숙성되고 있는 마카롱은 심심한 나머지 새로운 수 체계를 생각해냈다
# 마카롱은 이를 케이크 수라고 이름 붙이고, 다음과 같이 정의했다.
# 입력 : 첫째 줄에 케이크 수 a를 구성하는 자연수 a.x, a.y, a.z 가 차례대로 주어진다
# 둘째 줄에 케이크 수 c를 구성하는 자연수 c.x, c.y, c.z 가 차례대로 주어진다.
# 출력 : 문제의 조건을 만족하는 b.x, b.y, b.z를 하나의 공백을 사이에 두고 차례대로 출력한다.
# b는 1 ≤ b.x, b.y, b.z ≤ 100 이고 반드시 유일하게 존재한다.
a_x, a_y, a_z = map(int, input().split())
b_x, b_y, b_z = map(int, input().split())

print(b_x-a_z, b_y//a_y, b_z-a_x)
