s,e = map(int, input().split())
num_seq = []

for i in range(1, 46):
    num_seq += [i] * i

print(sum(num_seq[s-1:e]))
