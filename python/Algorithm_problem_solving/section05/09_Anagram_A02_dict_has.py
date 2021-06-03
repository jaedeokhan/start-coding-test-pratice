import sys
sys.stdin =open("input/09_input.txt", "r")

a = input()
b = input()
sH = dict()

for x in a:
    sH[x] = sH.get(x, 0) + 1

for x in b:
    sH[x] = sH.get(x, 0) - 1

for x in a:
    if sH.get(x) > 0:
        print('No')
        break
else:
    print('YES')
