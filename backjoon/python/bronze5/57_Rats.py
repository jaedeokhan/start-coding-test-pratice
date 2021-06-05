# 18301번, Rats(쥐)
# 문제 : Douglas is asking for your help to estimate the total number of rats in his area. Looking up in your statistics textbook,
# you propose using the Chapman estimator N, given by:
# 입력 : The input consists of a single line, with three space-separated integers: n1, n2, n12, in that order.
# 출력 : The output should contain a single line with the single integer N.
n1, n2, n12 = map(int, input().split())

print(((n1 + 1) * (n2 + 1)) // (n12 + 1) -1)
