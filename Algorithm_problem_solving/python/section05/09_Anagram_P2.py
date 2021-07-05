import sys
# sys.stdin = open("input/09_input.txt", "r")

a = 'AzbaAeCeZ'
b = 'bzaeeACAZ'
a_ans = [0] * 52
b_ans = [0] * 52

for i,j in zip(a,b):
    if i.isupper():
        a_ans[ord(i)-65] += 1
    else:
        a_ans[ord(i)-71] += 1
    if j.isupper():
        b_ans[ord(j)-65] += 1
    else:
        b_ans[ord(j)-71] += 1

if a_ans == b_ans:
    print('YES')
else:
    print('NO')
