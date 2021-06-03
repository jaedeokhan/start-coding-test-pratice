import sys
sys.stdin = open("input/09_input.txt", "r")

a = input()
b = input()

a_dict = {}
b_dict = {}

for i,j in zip(a,b):
    if i in a_dict: # i가 a_dict에 존재하면
        a_dict[i] = int(a_dict.get(i)) + 1
    else: # 존재하지 않으면
        a_dict[i] = 1

    if j in b_dict:
        b_dict[j] = int(b_dict.get(j)) + 1
    else:
        b_dict[j] = 1

a_dict = sorted(a_dict.items())
b_dict = sorted(b_dict.items())

if a_dict == b_dict:
    print('YES')
else:
    print('NO')
