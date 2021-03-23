# 88, 거기까지! 이제 그만~
# 1부터 n까지 정수를 하나씩 더 해 합을 만드는데, 입력한 수보다 같거나 커지는지 판단
i1 = int(input())
sum = 0
i = 1

while(sum < i1):
    sum += i
    i += 1
    print(f'sum : {sum}, i : {i}')

print(sum)
