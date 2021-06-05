# 문제 : JOI군은 카드 게임을 하고 있다. 이 카드 게임은 5회의 게임으로 진행되며, 그 총점으로 승부를 하는 게임
# JOI군의 각 게임의 득점을 나타내는 정수가 주어졌을 때, JOI군의 총점을 구하는 프로그램을 작성하시오.
# 입력 : i번째 줄(1 <= i <= 5)에는 정수 Ai가 적혀있다.
# 출력 : 표준 출력에 JOI군의 총점을 한 줄로 출력하라.

# 나의 코드
i1 = int(input())
i2 = int(input())
i3 = int(input())
i4 = int(input())
i5 = int(input())

print(i1+i2+i3+i4+i5)

# 다른 사람의 코드
print(sum(eval('int(input()),' * 5)))
