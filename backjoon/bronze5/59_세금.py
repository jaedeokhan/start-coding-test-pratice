# 20492번, 세금
# 문제 : 상금의 일부를 제세공과금으로 납부하고, 나머지 금액을 수령하게 된다.
# 전체 금액의 22%를 제세공과금으로 국가에 납부하고, 나머지 금액을 수령하게 된다.
# 하지만, 상금의 80%를 필요 경비로 인정하게 되면, 나머지 20% 중 22%만을 제세공과금으로 납부해도 된다.
# 입력 : 상금의 금액을 나타내는 하나의 정수 N 이 주어진다.
# 출력 : 1번 경우에 대한 답과 2번 경우에 대한 답을 사이에 공백을 두고 출력한다.

price = int(input())

print(int(price - (price * 0.22)), int(price - ((price * 0.2) * 0.22)))

# 리스트를 언패킹해서 출력하는 방법
A = [price * (100 - 22) // 100, price * (1000 - 22 * 2) // 1000]
print(A)
print(*A)
