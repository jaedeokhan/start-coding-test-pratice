# 21300번, Bottle Return
# 문제 : you will calculate the amount a customer will get refunded
# for a given collection of empty containers in the state of New York.
# 입력 : nput consists of a single line containing 6 space separated integer values
# representing the number of empty containers of beer, malt, wine products, carbonated soft drinks, seltzer and water.
# Each value will be in the range [0, 100].
# 출력 : The output consists of a single line that contains a single integer representing the total refund the customer should get in cents.
drink = list(map(int, input().split()))
cent = 0

for d in drink:
    cent += d * 5

print(cent)

# 다른 사람의 풀이 => 그냥 sum함수를 써버린다...오미
print(sum(map(int,input().split())) * 5)
