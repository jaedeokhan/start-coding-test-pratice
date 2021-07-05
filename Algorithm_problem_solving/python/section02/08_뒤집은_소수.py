import sys
sys.stdin = open("input/08_input.txt", "rt")

def reverse(x):
    
    result = (str(x)[::-1]).strip("0")
    
    return int(result)

def isPrime(x):

    if x != 1:
        for i in range(2, x):
            if x % i == 0:
                return 0

    else:
        return 0

    return x
    
N = int(input())
a = list(map(int, input().split()))

for i in range(N):
    value = isPrime(reverse(a[i]))
    if value != 0:
        print(value, end=' ')
    
