# 2941번

string = input()
two_alpha = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
cnt = 0

for a in two_alpha:

    two_cnt = string.count(a)
    
    if two_cnt > 0:
        cnt += two_cnt
        string = string.replace(a, '00')

for s in string:
    if s != '0':
        cnt += 1

print(cnt)
