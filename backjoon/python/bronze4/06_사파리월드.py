# 2420번, 사파리월드
# 문제 : 두 서브도메인을 합칠 때, 유명도의 차이가 너무 차이나지 않을 경우에만 두 서브도메인을 결혼시키는 것이다
# 두 서브도메인의 유명도가 주어졌을 때, 그 차이를 구하는 프로그램을 작성하시오.
# 입력 : 첫째 줄에 두 도메인의 유명도 N과 M이 주어진다. (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
# 출력 : 첫째 줄에 두 유명도의 차이 (|N-M|)을 출력한다.
n,m = map(int, input().split())

print(abs(n - m))
