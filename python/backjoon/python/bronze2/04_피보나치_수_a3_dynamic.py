n = int(input())
f = [0] * (n+1)

def fibonacci(x):
    
    if f[x] != 0:
        return f[x]
    else:
        if x == 1 or x == 2:
            f[x] = 1
        else:
            f[x] = fibonacci(x-1) + fibonacci(x-2)

        return f[x]
    
print(fibonacci(5))
