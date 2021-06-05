import sys

data = [int(sys.stdin.readline().strip()) for i in range(5)]


math_day = data[1] // data[3] if data[1] % data[3] == 0 else data[1] // data[3] + 1 
kor_day = data[2] // data[4] if data[2] % data[4] == 0 else data[2] // data[4] + 1

free_day = 0 if data[0] - max(math_day, kor_day) <= 0 else data[0] - max(math_day, kor_day)

print(free_day)
