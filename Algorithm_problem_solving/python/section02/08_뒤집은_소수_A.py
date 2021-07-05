import sys
sys.stdin = open("input/08_input.txt", "rt")
def reverse(x):

    res = 0

    while x > 0:
        t = x % 10
        res = res * 10 + t
        x = x // 10
      
    return res

def isPrime(x):

    if x == 1: # 1은 소수가 아니라, 1이면 False
        return False

    for i in range(2, x//2+1): 
        if x % i == 0: # x이 1과 자기 자신이 아니라, 약수가 존재할 때
            return False
    else:
        return True

n = int(input())
a = list(map(int, input().split()))

for x in a:
    tmp = reverse(x)
    if isPrime(tmp):
        print(tmp, end=' ')
    
