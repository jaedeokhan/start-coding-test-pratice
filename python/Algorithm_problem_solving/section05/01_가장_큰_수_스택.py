import sys
sys.stdin = open("input/01_input.txt", "r")

num, m = map(int, input().split())
num_list = [int(i) for i in str(num)]
cnt = 0
ans = []
ans.append(num_list.pop(0))


while num_list: # num_list가 존재할때까지

    if cnt == m:
        ans.append(num_list.pop(0))
        continue

    if ans[-1] >= num_list[0]:
        ans.append(num_list.pop(0))
    else:
        ans.pop(0)
        ans.append(num_list.pop(0))
        cnt += 1

print(ans)



