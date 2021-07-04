# 갑부 최백준 조교는 동전을 최소로 바꾸는데 성공했으나
# 김재홍 조교가 그 돈을 발견해서 최백준 조교에게 돈을 나누자고 따진다.
# 모든 생명체에게 돈을 분배한다.
# 입력 : 첫째 줄에는 최백준 조교가 가진 돈n과 돈을 받으러 온 생명체의 수m이 주어진다.
# 출력 : 첫째 줄에 생명체 하나에게 돌아가는 돈의 양을 출력한다.
#      : 둘째 줄에는 1원씩 분배할 수 없는 남는 돈을 출력한다.
n, m = map(int, input().split())

# python3에서는 오버플로우가 없어서 엄청 큰 수가 들어와도 int() 감싸줄 필요는 없다.
print(n // m)
print(n % m)
