# 15946번, 이상한 기호
# 문제 : 연산자의 기호는 ＠으로, A＠B = (A+B)×(A-B)으로 정의내리기로 했다.
# 효진이를 도와 정수 A, B가 주어지면 A＠B를 계산하는 프로그램을 만들어주자!
# 입력 : 첫째 줄에 A, B가 주어진다. (1 ≤ A, B ≤ 100,000)
# 출력 : 첫째 줄에 A＠B의 결과를 출력한다.

a, b = map(int, input().split())

# 4 3 => 7 * 1 => 7
# 3 4 => 7 * -1 => -7
print((a+b) * (a-b))
