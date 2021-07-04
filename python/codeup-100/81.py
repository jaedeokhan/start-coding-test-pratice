# 81, 언제까지 더해야 할까?
i1 = int(input())
sum = 0

for i in range(i1 + 1):

    sum += i
    
    if(sum >= i1):
        print(i)
        break



