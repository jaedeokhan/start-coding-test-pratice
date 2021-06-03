import sys
sys.stdin = open("input/09_input.txt", "r")

str1 = input()
str2 = input()
str1_d = {}
str2_d = {}

# dict.get(key, return value) 로 Key가 존재하지 않아도 리턴 value로 예외 처리가 가능하다
for s1, s2 in zip(str1, str2):
    str1_d[s1] = str1_d.get(s1, 0) + 1
    str2_d[s2] = str2_d.get(s2, 0) + 1

for i in str1_d.keys():
    if i in str2_d.keys():
        if str1_d[i] != str2_d[i]:
            print('NO')
            break
    else:
        print('NO')
        break
else:
    print('YES')
