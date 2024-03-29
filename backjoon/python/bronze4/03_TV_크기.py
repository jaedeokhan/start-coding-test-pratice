# 1297번, TV 크기
# 문제 : TV의 대각선 길이와, 높이 너비의 비율이 주어졌을 때, 실제 높이와 너비의 길이를 출력하는 프로그램을 작성하시오.
# 입력 : 첫째 줄에 TV의 대각선 길이, TV의 높이 비율, TV의 너비 비율이 공백 한 칸을 사이에 두고 주어진다
# 출력 : 첫째 줄에 TV의 높이와 TV의 너비를 공백 한 칸을 이용해서 구분지은 후 출력한다
# 만약, 실제 TV의 높이나 너비가 소수점이 나올 경우에는 그 수보다 작으면서 가장 큰 정수로 출력한다.
d, h, w = map(int, input().split())

result = d / (h ** 2 + w ** 2) ** 0.5

print(int(h * result), int(w * result))
