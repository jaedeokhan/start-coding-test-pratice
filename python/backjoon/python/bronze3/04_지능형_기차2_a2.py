# [bronze3][2460번] 지능형 기차2
# max() 함수를  사용해서 해결하는 방법
total = 0
largest = -2148000

for i in range(10):
    out, come = map(int, input().split())
    total += come - out
    largest = max(total, largest)

print(largest)
