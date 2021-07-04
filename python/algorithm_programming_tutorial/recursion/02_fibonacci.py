def fibonacci(x):
    
    if x <= 1:
        return 1
    else:
        return fibonacci(x-1) + fibonacci(x-2)

n = int(input())

answer = 0 if n == 0 else fibonacci(n-1) 

print(answer)
