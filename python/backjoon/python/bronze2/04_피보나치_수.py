n = int(input())
s = 0
e = 1
fibo = 0

if n == 1:
    fibo = 1

for i in range(n-1):

    fibo = s + e
    s = e
    e = fibo

print(fibo)
    
