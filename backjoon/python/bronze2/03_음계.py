value = list(map(int, input().split()))
answer = ''
a = 0
d = 0

for i in range(len(value)-1):
    if value[i] > value[i+1]:
        d += 1
    else:
        a += 1

if a == 7:
    answer = 'ascending'
elif d == 7:
    answer = 'descending'
else:
    answer = 'mixed'

print(answer)
