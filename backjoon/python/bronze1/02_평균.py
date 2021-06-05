num = int(input())
score = list(map(int, input().split()))
largest = -2148000
total = 0

for s in score:
    total += float(s)
    
    if s > largest:
        largest = s
    
print(total / largest / num * 100)

