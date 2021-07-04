a = int(input())
b= int(input())
c = int(input())

result = str(a * b * c)
check = [0] * 10

for r in result:
    check[int(r)] +=  1

for c in check:
    print(c)
