# 97, 바둑판에 흰 돌 넣기
# 바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
# n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.
# 금요일에는 모두 집으로 귀가한다.
# 입력 : 흰 돌의 개수(n), 흰 돌을 놓을 좌표(n+1)번째까지

n = int(input())
d = [ [0 for i in range(19)] for j in range(19)]

for i in range(n):
    row, col = map(int, input().split())
    d[row-1][col-1] = 1

for i in range(len(d)):
    for j in range(len(d)):
        print(d[i][j], end=' ')
    print()


