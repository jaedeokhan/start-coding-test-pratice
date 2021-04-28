# n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 구하시오
n = int(input())

def fib(n):
    curr, next = 0, 1
    for _ in range(n):
        curr, next = next, curr + next
    return curr

print(fib(n))


    
