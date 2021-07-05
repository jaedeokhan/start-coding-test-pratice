import sys
# sys.stdin = open("input/09_input.txt", "r")

a = 'AbaAeCeZ'
b = 'baeeACAZ'
a_ans = [0] * 52
b_ans = [0] * 52

for i,j in zip(a,b):
    if i.isupper():
        a_ans[ord(i)-39] += 1
    else:
        a_ans[ord(i)-97] += 1

    if j.isupper():
        print(ord(i)-39)
        b_ans[ord(i)-39] += 1
    else:
        b_ans[ord(i)-97] += 1

print(a_ans)
print(b_ans)
    
